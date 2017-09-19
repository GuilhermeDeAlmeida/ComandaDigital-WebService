package br.com.comandadigitalwebservice.ComandaDigitalWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ComandaDigitalWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComandaDigitalWebServiceApplication.class, args);
	}
}
