package com.example.firstcasebootcamp.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="PRODUCTS")
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name="productId")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private Long price;
    @Column(name ="expirationdate")
    private String expirationDate;

    @OneToMany
    private List <Comments> comments;


}
