package com.springcloud.ribbon.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.ribbon.bean.Foo;
import com.springcloud.ribbon.service.HelloService;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public String hi(@RequestParam String name,HttpServletRequest request) {
    	//测试session共享
    	HttpSession session = request.getSession();
    	
    	session.setAttribute("name", name);
    	
    	System.out.println("访问端口：" + request.getServerPort());
        return helloService.hiService( name );
    }
    
    @GetMapping(value = "/foo")
    public Foo getfoo() {
        return helloService.getFoo();
    }
}
