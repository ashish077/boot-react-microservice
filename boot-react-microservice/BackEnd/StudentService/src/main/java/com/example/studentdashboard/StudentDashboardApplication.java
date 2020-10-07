package com.example.studentdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@SpringBootApplication
public class StudentDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDashboardApplication.class, args);
		
		
	}
	
//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedOrigins("http://localhost:3000")
//                .allowedMethods("PUT, POST, GET, OPTIONS, DELETE")
//                .allowedHeaders("*")
//                .exposedHeaders("Authorization", "Content-Type");
//            }
//        };
//    }

}
