package com.Bank.BankConfigService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BankConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankConfigServiceApplication.class, args);
	}

}
