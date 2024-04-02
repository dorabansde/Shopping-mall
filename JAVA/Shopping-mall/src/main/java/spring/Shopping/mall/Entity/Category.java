package spring.Shopping.mall.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "CATEGORY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Category {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "CATEGORY_ID", updatable = false)
    private Long CATEGORY_ID;
    @Column(name = "CATEGORY_NAME")
    private String CATEGORY_NAME;
}
