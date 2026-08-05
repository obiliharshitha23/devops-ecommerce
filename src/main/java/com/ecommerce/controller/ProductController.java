package com.ecommerce.controller;


import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

@RequestMapping("/api/products")

public class ProductController {



private final ProductService service;


public ProductController(ProductService service){

this.service=service;

}



@PostMapping

public Product addProduct(
@RequestBody Product product){

return service.save(product);

}



@GetMapping

public List<Product> getProducts(){

return service.getAll();

}



@GetMapping("/{id}")

public Product getProduct(
@PathVariable Long id){

return service.getById(id);

}



@DeleteMapping("/{id}")

public String delete(
@PathVariable Long id){

service.delete(id);

return "Deleted";

}


}
