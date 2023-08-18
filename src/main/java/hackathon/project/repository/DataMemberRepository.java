package hackathon.project.repository;

import hackathon.project.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMemberRepository extends JpaRepository<Member, Long> {
}
