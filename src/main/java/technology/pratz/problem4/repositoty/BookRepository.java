package technology.pratz.problem4.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import technology.pratz.problem4.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
