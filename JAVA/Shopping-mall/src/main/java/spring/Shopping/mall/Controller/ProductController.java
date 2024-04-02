package spring.Shopping.mall.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.Shopping.mall.Dto.AddProductRequest;
import spring.Shopping.mall.Dto.ProductResponse;
import spring.Shopping.mall.Dto.UpdateProductRequest;
import spring.Shopping.mall.Entity.Product;
import spring.Shopping.mall.Service.ProductService;

import java.util.List;

@RequiredArgsConstructor
@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러

public class ProductController {

    private final ProductService productService;

    // HTTP메서드가 POST일 때 전달받은 URL과 동일하면 메서드로 매핑
    @PostMapping("/api/products") // http://localhost:8080/api/articles
    // @RequestBody로 요청 본문 값 매핑
    public ResponseEntity<Product> addProducts(@RequestBody AddProductRequest request) {
        Product savedProduct = productService.save(request);
        // 요청한 자원이 성공적으로 생성되었으며 저장된 블로그 글 정보를 응답 객체에 담아 전송
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedProduct);
    }

    @GetMapping("/api/products")    // 모든글 조회하는 기능
    public ResponseEntity<List<ProductResponse>> findAllProducts() {
        List<ProductResponse> products = productService.findAll()
                .stream()
                .map(ProductResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(products);
    }

    @GetMapping("/api/products/{id}")   //특정 아티클 조회
    public ResponseEntity<ProductResponse> findProduct(@PathVariable long id) {
        Product product = productService.findById(id);

        return ResponseEntity.ok()
                .body(new ProductResponse(product));
    }

    @DeleteMapping("/api/products/{id}") //특정 id 삭제
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        productService.delete(id);

        return ResponseEntity.ok()
                .build();
    }

    @PutMapping("/api/products/{id}")   //(PutMapping) 특정아티클 updatedArticle를 기존의 값을 바꿔주는 기능
    public ResponseEntity<Product> updateProduct(@PathVariable long id,
                                                 @RequestBody UpdateProductRequest request) {
        Product updatedProduct = productService.update(id, request);

        return ResponseEntity.ok()
                .body(updatedProduct);
    }
}