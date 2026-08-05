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

---

### UserController.java

```java
package com.ecommerce.controller;


import com.ecommerce.entity.User;
import com.ecommerce.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserService userService;


    public UserController(UserService userService) {

        this.userService = userService;

    }


    @PostMapping
    public User createUser(@RequestBody User user) {

        return userService.save(user);

    }


    @GetMapping
    public List<User> getAllUsers() {

        return userService.getAllUsers();

    }


    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {

        return userService.getUserById(id);

    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);

        return "User deleted successfully";

    }

}
```

---

### OrderController.java

```java
package com.ecommerce.controller;


import com.ecommerce.entity.Order;
import com.ecommerce.service.OrderService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/orders")
public class OrderController {


    private final OrderService orderService;


    public OrderController(OrderService orderService) {

        this.orderService = orderService;

    }


    @PostMapping
    public Order createOrder(@RequestBody Order order) {

        return orderService.createOrder(order);

    }


    @GetMapping
    public List<Order> getAllOrders() {

        return orderService.getAllOrders();

    }


    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {

        return orderService.getOrderById(id);

    }


    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {

        orderService.deleteOrder(id);

        return "Order deleted successfully";

    }

}
```

