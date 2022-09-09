package com.example.firstcasebootcamp.service;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Comments> writeAllCommentsFromCustomer(Customer customer, Comments comments);

}
