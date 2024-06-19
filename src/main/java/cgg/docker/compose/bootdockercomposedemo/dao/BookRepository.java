package cgg.docker.compose.bootdockercomposedemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import cgg.docker.compose.bootdockercomposedemo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
