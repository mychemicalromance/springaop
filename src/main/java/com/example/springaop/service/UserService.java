package com.example.springaop.service;

import com.example.springaop.entity.User;
import com.example.springaop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Component
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> listAll(){
        return repository.findAll();
    }

    /**
     * 私有方法加切面有问题，
     * final方法加切面也有问题
     *
     */
    @Transactional
    public void save(){
        User user = new User();
        user.setName(UUID.randomUUID().toString());
        repository.save(user);
        System.out.println(user.getId());
        System.out.println(user.getName());
    }

}
