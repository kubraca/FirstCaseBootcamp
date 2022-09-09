package com.example.firstcasebootcamp.service;

import com.example.firstcasebootcamp.entity.Comments;
import com.example.firstcasebootcamp.entity.Product;

import java.util.List;

public interface ProductService {
   public List<Comments> writeAllComments(Product product, Comments comments);
   public Product createProduct(Product newProduct);
}
