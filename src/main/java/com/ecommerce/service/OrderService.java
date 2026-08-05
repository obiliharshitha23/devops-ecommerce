package com.ecommerce.service; 
import com.ecommerce.entity.Order;
import java.util.List; 
public interface OrderService { 
  Order createOrder(Order order); 
  List<Order> getAllOrders();
  Order getOrderById(Long id); 
  void deleteOrder(Long id); 
}
