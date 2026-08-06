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


