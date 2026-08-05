package com.ecommerce.service;


import com.ecommerce.entity.Product;
import java.util.List;


public interface ProductService {


    Product save(Product product);


    List<Product> getAll();


    Product getById(Long id);


    void delete(Long id);

}
