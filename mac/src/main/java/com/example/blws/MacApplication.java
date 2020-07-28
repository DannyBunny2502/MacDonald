package com.example.blws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MacApplication {
	@RequestMapping("/")
	public String index() {
		return "Stringboot Hello World";
	}
	
	@RequestMapping("/ysy")
	public String index2() {
		return "Stringboot YSY World";
	}
	public static void main(String[] args) {
		SpringApplication.run(MacApplication.class, args);
	}

}
