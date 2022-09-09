package com.example.firstcasebootcamp.repository;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Customer;
import com.example.firstcasebootcamp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Long> {
    //List<Comments> writeAllComments(Product product, Comments comments);

}
