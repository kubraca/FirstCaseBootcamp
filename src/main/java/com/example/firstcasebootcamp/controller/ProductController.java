package com.example.firstcasebootcamp.controller;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Customer;
import com.example.firstcasebootcamp.entity.Product;
import com.example.firstcasebootcamp.service.CustomerService;
import com.example.firstcasebootcamp.service.Impl.ProductServiceImpl;
import com.example.firstcasebootcamp.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;

    @GetMapping("/getCommentsFromProduct")
    public List<Comments> writeAllComments(@RequestBody Product product,Comments comments){
        return productService.writeAllComments(product,comments);
    }
    @PostMapping("/createProduct")
    public Product createProduct(Product newProduct){
        return productService.createProduct(newProduct);
    }

}
