package jpabook.jpashop;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Orders")
@Getter @Setter
public class Hello {
    private String data;
}
