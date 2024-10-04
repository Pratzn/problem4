package technology.pratz.problem4.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import technology.pratz.problem4.entity.Author;
import technology.pratz.problem4.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@Valid @RequestBody Author author) {
        Author savedAuthor = authorService.saveAuthor(author);
        return ResponseEntity.ok(savedAuthor);
    }

    @PutMapping
    public ResponseEntity<Author> updateAutor(@Valid @RequestBody Author author) {
        Author savedAuthor = authorService.saveAuthor(author);
        return ResponseEntity.ok(savedAuthor);
    }

    @DeleteMapping
    public ResponseEntity<Author> deleteAutor(@Valid @RequestBody Author author) {
        authorService.deleteAutor(author);
        return ResponseEntity.noContent().build();
    }
}

