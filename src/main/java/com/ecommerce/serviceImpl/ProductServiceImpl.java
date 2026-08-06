package com.ecommerce.serviceImpl;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product save(Product product) {

        return productRepository.save(product);

    }


    @Override
    public List<Product> getAll() {

        return productRepository.findAll();

    }


    @Override
    public Product getById(Long id) {

        return productRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Product not found"));

    }


    @Override
    public void delete(Long id) {

        productRepository.deleteById(id);

    }

}


