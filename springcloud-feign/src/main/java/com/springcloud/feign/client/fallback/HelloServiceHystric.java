package com.springcloud.feign.client.fallback;

import org.springframework.stereotype.Component;

import com.springcloud.feign.client.HelloService;


@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }
}