package com.tech.biran.demo.br.demo.d;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableApolloConfig
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableTransactionManagement
@SpringBootApplication
public class BrDemoDApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrDemoDApplication.class, args);
    }

}
