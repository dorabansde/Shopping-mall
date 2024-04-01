package spring.Shopping.mall.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.Shopping.mall.Entity.Like;
import spring.Shopping.mall.Entity.Member;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
