package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.Product;
import com.lankin.lpr.repository.ProductRepository;
import com.lankin.lpr.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        return productRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Product", "Id", id));
    }

    @Override
    public Product updateProduct(Product product, long id) {
        Product existingProduct = productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product", "Id", id));

        existingProduct.setTitle(product.getTitle());
        existingProduct.setVisibility(product.getVisibility());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setInfo(product.getInfo());
        productRepository.save(existingProduct);
        return existingProduct;
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Product", "Id", id));
        productRepository.deleteById(id);
    }
}
