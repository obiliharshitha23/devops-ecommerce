### ProductController.java

```java
package com.ecommerce.controller;

import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    private final ProductService productService;


    public ProductController(ProductService productService) {

        this.productService = productService;

    }


    @PostMapping
    public Product addProduct(@RequestBody Product product) {

        return productService.save(product);

    }


    @GetMapping
    public List<Product> getAllProducts() {

        return productService.getAll();

    }


    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {

        return productService.getById(id);

    }


    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {

        productService.delete(id);

        return "Product deleted successfully";

    }

}
```

