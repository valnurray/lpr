package com.lankin.lpr.service;

import com.lankin.lpr.model.Product;
import com.lankin.lpr.model.Role;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long id);
    Product updateProduct(Product product, long id);
    void deleteProduct(long id);
}
