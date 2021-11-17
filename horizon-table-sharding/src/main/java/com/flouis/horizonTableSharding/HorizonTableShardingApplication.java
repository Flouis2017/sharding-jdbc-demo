package com.flouis.horizonTableSharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.flouis.horizonTableSharding.dao")
public class HorizonTableShardingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorizonTableShardingApplication.class, args);
	}

}
