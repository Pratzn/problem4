package technology.pratz.problem4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technology.pratz.problem4.entity.Book;
import technology.pratz.problem4.repositoty.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(b->books.add(b));
        return books;
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
