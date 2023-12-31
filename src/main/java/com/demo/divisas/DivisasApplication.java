package com.demo.divisas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DivisasApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder cryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DivisasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String password= "12345";
		System.out.println(cryptPasswordEncoder.encode(password));
	}
}
