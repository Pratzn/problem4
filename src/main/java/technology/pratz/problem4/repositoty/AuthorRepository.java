package technology.pratz.problem4.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import technology.pratz.problem4.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
