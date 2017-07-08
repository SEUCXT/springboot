package com.example.service.Impl;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 17858 on 2017-07-08.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    public User getUserByUsername(String username){
        User user = userRepository.findByUsername("seucxt");
        return user;
    }

}
