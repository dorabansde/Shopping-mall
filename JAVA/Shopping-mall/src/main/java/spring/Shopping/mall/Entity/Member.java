package spring.Shopping.mall.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Table(name = "MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Member {

    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "USER_ID", updatable = false)
    private Long USER_ID;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String EMAIL;

    @Column(name = "PASSWORD")
    private String PASSWORD;

    @Column(name = "AGE")
    private int AGE;

    @Column(name = "GENDER")
    private char GENDER;

    @Column(name = "PHONE")
    private int PHONE;

    @Column(name = "ADDRESS")
    private String ADDRESS;

    @CreatedDate
    @Column(name = "ENROLL_DATE")
    private LocalDateTime ENROLL_DATE;

    @LastModifiedDate
    @Column(name = "LAST_UPDATE")
    private LocalDateTime LAST_UPDATE;

    @Builder
    public Member(String EMAIL, String PASSWORD, int AGE, char GENDER
            , int PHONE, String ADDRESS, LocalDateTime ENROLL_DATE, LocalDateTime LAST_UPDATE) {
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
        this.AGE = AGE;
        this.GENDER = GENDER;
        this.PHONE = PHONE;
        this.ADDRESS = ADDRESS;
        this.ENROLL_DATE = ENROLL_DATE;
        this.LAST_UPDATE = LAST_UPDATE;
    }
}
