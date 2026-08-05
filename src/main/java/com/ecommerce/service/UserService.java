package com.ecommerce.service; 
import com.ecommerce.entity.User; 
import java.util.List; 
public interface UserService { 
  User save(User user); 
  List<User> getAllUsers(); 
  User getUserById(Long id); 
  void deleteUser(Long id); 
}
