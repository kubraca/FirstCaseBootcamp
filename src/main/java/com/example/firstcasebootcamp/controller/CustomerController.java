package com.example.firstcasebootcamp.controller;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Customer;
import com.example.firstcasebootcamp.entity.Product;
import com.example.firstcasebootcamp.service.CustomerService;
import com.example.firstcasebootcamp.service.Impl.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerServiceImpl customerService;
    @GetMapping("/getCommentsFromCustomer")
    public List<Comments> writeAllCommentsFromCustomer(@RequestBody Customer customer, Comments comments){
        return customerService.writeAllCommentsFromCustomer(customer,comments);
    }
}
