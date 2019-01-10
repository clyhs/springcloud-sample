package com.springcloud.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcloud.feign.client.fallback.HelloServiceHystric;


@FeignClient(value = "service-hello",fallback = HelloServiceHystric.class)
public interface HelloService {
	
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

