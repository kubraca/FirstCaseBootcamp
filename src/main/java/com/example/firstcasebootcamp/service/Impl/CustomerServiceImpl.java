package com.example.firstcasebootcamp.service.Impl;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Customer;
import com.example.firstcasebootcamp.repository.CustomerRepository;
import com.example.firstcasebootcamp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Comments> writeAllCommentsFromCustomer(Customer customer, Comments comments) {
        return customer.getComments();
    }

}
