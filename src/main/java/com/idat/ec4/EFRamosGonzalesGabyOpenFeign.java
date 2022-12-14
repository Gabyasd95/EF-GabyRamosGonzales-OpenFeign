package com.idat.ec4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EFRamosGonzalesGabyOpenFeign {

	public static void main(String[] args) {
		SpringApplication.run(EFRamosGonzalesGabyOpenFeign.class, args);
	}

}
