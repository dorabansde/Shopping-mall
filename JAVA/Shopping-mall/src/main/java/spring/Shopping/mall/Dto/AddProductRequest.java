package spring.Shopping.mall.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spring.Shopping.mall.Entity.Product;

import java.time.LocalDateTime;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddProductRequest {

    private String title;
    private String content;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

//
//    AddArticleRequest() {};
//    AddArticleRequest(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }

//    public String getContent() {
//        return this.content;
//    }
//        public void setContent(String content) {
//         this.content = content;
//    }

    public Product toEntity() { // 생성자를 사용해 객체 생성 (빌더타입)
        return Product.builder()
                .
                .build();
    }
}