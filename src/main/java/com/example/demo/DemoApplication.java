package com.example.demo;

import com.example.demo.service.TestService;
import org.springframework.boot.CommandLineRunner;
import com.sun.javaws.exceptions.ExitException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private TestService helloWorldService;

	@Override
	public void run(String... args) {
		System.out.println(this.helloWorldService.getHelloMessage());
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
