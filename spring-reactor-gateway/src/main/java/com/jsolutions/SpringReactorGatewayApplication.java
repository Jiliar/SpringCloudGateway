package com.jsolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringReactorGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactorGatewayApplication.class, args);
    }

}
