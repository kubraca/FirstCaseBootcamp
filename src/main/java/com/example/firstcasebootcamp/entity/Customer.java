package com.example.firstcasebootcamp.entity;

import lombok.*;

import javax.persistence.*;

import lombok.Builder;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="CUSTOMERS")
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Customer {
    @Id
    @Column(name ="customerId")
    private Long id;
    @Column(length = 50,name ="name")
    private char customerName;
    @Column(length = 50,name ="lastname")
    private char lastName;
    @Column(length = 50,name ="mail")
    private char email;
    @Column(length = 15,name ="phone")
    private char phoneNumber;

    //private List<Product> product_list;
    @OneToMany()
    private List<Comments> comments;

}
