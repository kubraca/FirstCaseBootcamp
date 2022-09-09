package com.example.firstcasebootcamp.repository;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    //List<Comments> writeAllCommentsFromCustomer(Customer customer, Comments comments);
}
