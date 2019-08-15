package com.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.projeto.repository")
public class ApplicationCrud {
	//https://www.vogella.com/tutorials/EclipseGradle/article.html#creating-web-applications

	public static void main(String[] args) {
        SpringApplication.run(ApplicationCrud.class, args);
    }
	
}
