package spring.Shopping.mall.Dto;

import lombok.Getter;
import spring.Shopping.mall.Entity.Product;
@Getter
public class ProductResponse {
    private final Long PRODUCT_ID;


    public ProductResponse(Product product) {
        this.PRODUCT_ID = product.;
    }
}