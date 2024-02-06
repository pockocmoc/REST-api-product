package com.pockocmoc.spring_seminar_8_hw.service;

import com.pockocmoc.spring_seminar_8_hw.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    Product addProduct(Product product);

    List<Product> findAllProduct();

    Optional<Product> findProductById(Long id);

    List<Product> findProductByNameContaining(String keyword);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
