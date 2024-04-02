package spring.Shopping.mall.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.parameters.P;

import java.time.LocalDateTime;

public class Order {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "ORDER_ID", updatable = false)
    private Long ORDER_ID;
    @Column
    private Long USER_ID;
    @Column
    private Long PRODUCT_ID;
    @Column(name = "TOTAL_PRICE")
    private int TOTAL_PRICE;
    @Column(name = "ORDER_COMMENT")
    private String ORDER_COMMENT;

    @CreatedDate
    @Column(name = "ORDER_ENROLL")
    private LocalDateTime ORDER_ENROLL;
    @Column(name = "ORDER_PHONE")
    private int ORDER_PHONE;
    @Column(name = "ADDRESS")
    private String ADDRESS;

    @Builder
    public Order(Long USER_ID, Long PRODUCT_ID, int TOTAL_PRICE,
                 String ORDER_COMMENT, LocalDateTime ORDER_ENROLL,
                 int ORDER_PHONE, String ADDRESS) {

        this.USER_ID = USER_ID;
        this.PRODUCT_ID = PRODUCT_ID;
        this.TOTAL_PRICE = TOTAL_PRICE;
        this.ORDER_COMMENT = ORDER_COMMENT;
        this.ORDER_ENROLL = ORDER_ENROLL;
        this.ORDER_PHONE = ORDER_PHONE;
        this.ADDRESS = ADDRESS;
    }
}