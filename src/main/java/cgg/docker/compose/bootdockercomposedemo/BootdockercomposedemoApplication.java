package cgg.docker.compose.bootdockercomposedemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.docker.compose.bootdockercomposedemo.dao.BookRepository;
import cgg.docker.compose.bootdockercomposedemo.model.Book;
import lombok.AllArgsConstructor;

@SpringBootApplication
@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BootdockercomposedemoApplication {

	private BookRepository repository;

	@PostMapping
	public Book createBook(@RequestBody Book book) {

		return repository.save(book);
	}

	@GetMapping
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(BootdockercomposedemoApplication.class, args);
	}

}
