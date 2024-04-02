package spring.Shopping.mall.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.Shopping.mall.Entity.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
        Optional<Product> findByPRODUCT_ID(int product_Id);
    }