package com.tarea4.categoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CategoriaApplication{

	public static void main(String[] args) {
		SpringApplication.run(CategoriaApplication.class, args);
	}

}

@Configuration
class RestTemplateConfig {

	// Crea un bean para que restTemplate pueda llamar a los servicios REST
	@Bean
	@LoadBalanced        // Load balance entre servicios corriendo en diferentes puertos.
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}