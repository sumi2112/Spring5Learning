package com.learning.sumi.Spring5Learning.bootstrap;

import com.learning.sumi.Spring5Learning.model.Author;
import com.learning.sumi.Spring5Learning.model.Book;
import com.learning.sumi.Spring5Learning.model.Publisher;
import com.learning.sumi.Spring5Learning.repository.AuthorRepository;
import com.learning.sumi.Spring5Learning.repository.BookRepository;
import com.learning.sumi.Spring5Learning.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
This class is implementing CommandLineRunner, which is used to run a block of code after the springBootApplication starts and
context is initialized. This interface is used to perform pre-checks, configure resources, initialize data before the application
starts receiving request.
Here we are initializing some data to test our repository code.
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       Publisher pb = new Publisher("pb", "Cell Street" ,"Madrid");
       publisherRepository.save(pb);

        Author author1 = new Author("Ed", "Smith");
        Author author2 = new Author("brook", "Smith");

        Book book1 = new Book("JPA", 123455L);
        Book book2 = new Book("Java", 14874455L);

        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(pb);
        pb.getBooks().add(book1);

        authorRepository.save(author1);
        bookRepository.save(book1);
        publisherRepository.save(pb);

        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(pb);
        pb.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(pb);

        System.out.println("Data Initialized: Books:" + bookRepository.count() +
                " Authors:" +authorRepository.count() +
                " Publishers:" + publisherRepository.count() );
                //"Publisher Books Count: " + pb.getBooks());

        System.out.println("Data Initialized: Publishers:" + bookRepository.count() + " Authors:" +authorRepository.count());


    }
}
