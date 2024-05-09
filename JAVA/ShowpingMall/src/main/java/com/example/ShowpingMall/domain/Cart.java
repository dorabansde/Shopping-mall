package com.example.ShowpingMall.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", updatable = false)
    private Long cartId;

    @Column(name = "user_id", updatable = false)
    private Long userId;

    @Column(name = "product_id", updatable = false)
    private Long productId;

    @Column(name = "cart_quantity")
    private Long cartQuantity;

    @Column(name = "cart_price")
    private Long cartPrice;

    @Column(name = "cart_all_price")
    private Long cartAllPrice;

    @Column(name = "order_id", updatable = false)
    private Long order_Id;

    @Builder
    public Cart(Long userId, Long cartPrice, Long cartQuantity, Long cartAllPrice, Long productId, Long order_Id) {
        this.userId = userId;
        this.cartPrice = cartPrice;
        this.cartQuantity = cartQuantity;
        this.cartAllPrice = cartAllPrice;
        this.productId = productId;
        this.order_Id = order_Id;
    }
}
