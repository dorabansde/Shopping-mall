package spring.Shopping.mall.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.Shopping.mall.Entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}