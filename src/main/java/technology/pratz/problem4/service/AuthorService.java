package technology.pratz.problem4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technology.pratz.problem4.entity.Author;
import technology.pratz.problem4.repositoty.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }



    public void deleteAutor(Author author){
        authorRepository.delete(author);
    }
}

