package spring.Shopping.mall.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "CART")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Cart {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "CART_ID", updatable = false)
    private Long CART_ID;

    @Column(name = "USER_ID")
    private Long USER_ID;
    @Column(name = "PRODUCT_ID")
    private Long PRODUCT_ID;
    @Column(name = "CART_QUANTITY")
    private int CART_QUANTITY;
    @Column(name = "CART_PRICE")
    private int CART_PRICE;
    @Column(name = "CART_APRICE")
    private int CART_APRICE;

}
