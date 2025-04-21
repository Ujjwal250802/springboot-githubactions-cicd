package com.example.springboot_cicd_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdGithubApplication {
	@GetMapping("/hello")
	public String welcome(){
		return "welcome to my project!!! this is spring boot project i'm using github actions cicd pipeline";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdGithubApplication.class, args);
	}

}


