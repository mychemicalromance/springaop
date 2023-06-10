package com.example.springaop.aop;

import com.example.springaop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceA {

    @Autowired
    private UserRepository userRepository;

    //有切面，动态代理
    @Transactional
    public final void transaction(){
        userRepository.findAll();
        System.out.println("transaction");
    }


    @Transactional
    private void transaction2(){
        userRepository.findAll();
        System.out.println("t2");
    }

}
