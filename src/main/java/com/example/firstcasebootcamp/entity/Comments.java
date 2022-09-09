package com.example.firstcasebootcamp.entity;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="PRODUCTS")
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Comments {
    @Id
    @Column(name="commetId")
    private Long id;
    @Column(name="commentDate")
    private Date commentDate;
    //private Product product;

   // private Comments comments;


}
