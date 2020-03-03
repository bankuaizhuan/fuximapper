package com.fuxi.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.fuxi.mapper.mapper")
@SpringBootApplication
public class FuximapperApplication {//核心启动类

	public static void main(String[] args) {
		SpringApplication.run(FuximapperApplication.class, args);
	}

}
