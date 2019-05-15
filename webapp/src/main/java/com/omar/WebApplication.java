package com.omar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author zhanglei03
 * @Date 2019/5/14
 **/
@SpringBootApplication(scanBasePackages = {"com.omar.dao", "com.omar.controller"})
@MapperScan("com.omar.dao")
public class WebApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
