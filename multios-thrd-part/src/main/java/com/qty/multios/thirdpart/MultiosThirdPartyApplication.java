package com.qty.multios.thirdpart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MultiosThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiosThirdPartyApplication.class, args);
    }

}
