package spring.Shopping.mall.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.Shopping.mall.Dto.AddProductRequest;
import spring.Shopping.mall.Dto.UpdateProductRequest;
import spring.Shopping.mall.Entity.Product;
import spring.Shopping.mall.Repository.ProductRepository;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class ProductService {

    private final ProductRepository productRepository;

    // 블로그 글 추가 메서드
    public Product save(AddProductRequest request) {

        AddProductRequest aar1 = new AddProductRequest();
        AddProductRequest aar2 = new AddProductRequest();
//        aar2.setContent("내용수정");
        AddProductRequest aar3 = new AddProductRequest();
        //aar2.getContent();
        return productRepository.save(request.toEntity());
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public Product findById(long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        productRepository.deleteById(id);
    }

    @Transactional // 트랜젝션 메서드
    public Product update(long id, UpdateProductRequest request) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        product.update(request.getTitle(), request.getContent(), request.getUpdatedAt());

        return product;
    }
}
