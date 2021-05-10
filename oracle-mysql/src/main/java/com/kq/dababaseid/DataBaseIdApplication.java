package com.kq.dababaseid;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/
 * @author kq
 * @date 2021-05-10 10:25
 * @since 2020-0630
 */

@MapperScan("com.kq.dababaseid.mapper.ex")
@SpringBootApplication
public class DataBaseIdApplication {

    protected static Logger logger = LoggerFactory.getLogger(DataBaseIdApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataBaseIdApplication.class, args);
    }

}
