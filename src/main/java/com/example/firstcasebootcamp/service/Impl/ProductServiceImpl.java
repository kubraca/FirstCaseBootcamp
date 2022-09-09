package com.example.firstcasebootcamp.service.Impl;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Customer;
import com.example.firstcasebootcamp.entity.Product;
import com.example.firstcasebootcamp.repository.ProductRepository;
import com.example.firstcasebootcamp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    @Override
    public List<Comments> writeAllComments(Product product, Comments comments) {
        return product.getComments();
    }
}
