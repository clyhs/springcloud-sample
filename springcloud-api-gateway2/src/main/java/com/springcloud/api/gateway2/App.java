package com.springcloud.api.gateway2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class App {

    public static void main(String[] args) {
        SpringApplication.run( App.class, args );
    }

    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }
}