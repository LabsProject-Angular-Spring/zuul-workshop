package com.unilibre.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.net.MalformedURLException;


@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Server {

    public static void main(String[] args) throws MalformedURLException {

        SpringApplication.run(Server.class, args);

    }

}
