package com.tourist.index.touristindex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class TouristIndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristIndexApplication.class, args);
	}

}
