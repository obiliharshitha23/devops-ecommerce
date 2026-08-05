### ProductServiceImpl.java

```java
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
```

---

### UserServiceImpl.java

```java
package com.ecommerce.serviceImpl;

import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;

    }


    @Override
    public User save(User user) {

        return userRepository.save(user);

    }


    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();

    }


    @Override
    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));

    }


    @Override
    public void deleteUser(Long id) {

        userRepository.deleteById(id);

    }


}
```

---

### OrderServiceImpl.java

```java
package com.ecommerce.serviceImpl;


import com.ecommerce.entity.Order;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderService;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {


    private final OrderRepository orderRepository;


    public OrderServiceImpl(OrderRepository orderRepository) {

        this.orderRepository = orderRepository;

    }


    @Override
    public Order createOrder(Order order) {

        order.setTotalPrice(
                order.getQuantity() * order.getTotalPrice()
        );

        return orderRepository.save(order);

    }


    @Override
    public List<Order> getAllOrders() {

        return orderRepository.findAll();

    }


    @Override
    public Order getOrderById(Long id) {

        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found"));

    }


    @Override
    public void deleteOrder(Long id) {

        orderRepository.deleteById(id);

    }

}
```
