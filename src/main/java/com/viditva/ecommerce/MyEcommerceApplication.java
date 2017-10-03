package com.viditva.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@ComponentScan("com.viditva.ecommerce.service")
@ComponentScan("com.viditva.ecommerce.dao")
@ComponentScan("com.viditva.ecommerce.controller")*/
public class MyEcommerceApplication {
    public static void main(String[] args) {
        System.out.println("Starting");
        try {
            SpringApplication.run(MyEcommerceApplication.class, args);
        } catch (Exception e ){
            System.out.println("Error" );
            e.printStackTrace();
        }
        System.out.println("Ending");
    }
}
