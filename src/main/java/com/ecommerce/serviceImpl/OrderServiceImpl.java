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
