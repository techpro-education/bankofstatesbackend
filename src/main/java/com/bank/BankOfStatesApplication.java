package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankOfStatesApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/bankofStates");
		SpringApplication.run(BankOfStatesApplication.class, args);
	}

}
