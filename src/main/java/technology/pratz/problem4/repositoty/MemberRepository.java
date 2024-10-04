package technology.pratz.problem4.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import technology.pratz.problem4.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
