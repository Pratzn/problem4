package technology.pratz.problem4.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Book {

    public Book(){

    }

    public Book(Long id, String title, String isbn, Author author) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    // Getters and Setters
}

