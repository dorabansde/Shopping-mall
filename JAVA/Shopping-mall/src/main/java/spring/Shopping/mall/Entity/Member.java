package spring.Shopping.mall.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.parameters.P;

import java.util.Date;

@Table(name = "member")
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

    @Column(name = "ENROLL_DATE")
    private Date ENROLL_DATE;

    @Column(name = "LAST_UPDATE")
    private Date LAST_UPDATE;

    @Builder
    public Member(String EMAIL, String PASSWORD, int AGE, char GENDER
            , int PHONE, String ADDRESS, Date ENROLL_DATE, Date LAST_UPDATE) {
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
