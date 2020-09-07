package com.service.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author : pc
 * @date : 2020/9/7
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.module.*.client")
@MapperScan(basePackages = {"com.service.pay.mapper"})
@ComponentScan(basePackages = {"com.scottxuan","com.module","com.service.pay"})
public class PayApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PayApplication.class);
    }
}