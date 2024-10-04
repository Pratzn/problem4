package technology.pratz.problem4.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technology.pratz.problem4.entity.Book;
import technology.pratz.problem4.service.BookService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> ret = new ArrayList<>();
        bookService.getAllBooks().forEach(b->ret.add(b));
        return ret;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id)
                .map(book -> ResponseEntity.ok().body(book))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@Valid @RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @PostMapping
    public ResponseEntity<Book> updateBook(@Valid @RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}

