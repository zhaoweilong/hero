package com.gtloong.hero.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboConsumerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerBootstrap.class).close();
    }


}
