package spring.Shopping.mall.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "LIKE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Like {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "LIKE_ID", updatable = false)
    private Long LIKE_ID;

    @Column(name = "PRODUCT_ID", nullable = false, unique = true)
    private String PRODUCT_ID;

    @Column(name = "LIKE_COUNT")
    private int LIKE_COUNT;
}
