package com.gq.modules.transportPrice;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.gq.modules"})
//@MapperScan(basePackages={"com.gq.modules.transportPrice.dao"})//dao层写完注解后，需要在入口类加入Mapper注解扫包
public class AlimamaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlimamaApplication.class, args);
    }

}
