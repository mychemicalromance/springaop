package com.example.springaop.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    public void test(){
        System.out.println("test");
    }
}
