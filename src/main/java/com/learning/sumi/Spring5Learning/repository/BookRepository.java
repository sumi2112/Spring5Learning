package com.learning.sumi.Spring5Learning.repository;

import com.learning.sumi.Spring5Learning.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
