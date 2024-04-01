package spring.Shopping.mall.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

public class Product {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "PRODUCT_ID", updatable = false)
    private Long PRODUCT_ID;
    @OneToMany(mappedBy = "Category")
    private Long CATEGORY_ID;
    @Column(name = "PRODUCT_PRICE")
    private int PRODUCT_PRICE;
    @Column(name = "PRODUCT_NAME")
    private String  PRODUCT_NAME;
    @Column(name = "PRODUCT_INFO")
    private String PRODUCT_INFO;
    @Column(name = "PRODUCT_STOCK")
    private int PRODUCT_STOCK;

    @CreatedDate
    @Column(name = "PRODUCT_ENROLL")
    private LocalDateTime PRODUCT_ENROLL;
}
