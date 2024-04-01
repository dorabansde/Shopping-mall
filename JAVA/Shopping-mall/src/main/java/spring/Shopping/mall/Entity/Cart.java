package spring.Shopping.mall.Entity;

import jakarta.persistence.*;

public class Cart {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "CART_ID", updatable = false)
    private Long CART_ID;

    @OneToMany(mappedBy = "Member")
    private Long USER_ID;
    @OneToMany(mappedBy = "Product")
    private Long PRODUCT_ID;
    @Column(name = "CART_QUANTITY")
    private int CART_QUANTITY;
    @Column(name = "CART_PRICE")
    private int CART_PRICE;
    @Column(name = "CART_APRICE")
    private int CART_APRICE;

}
