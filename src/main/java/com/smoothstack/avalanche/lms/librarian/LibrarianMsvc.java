package com.smoothstack.avalanche.lms.librarian;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LibrarianMsvc {

	public static void main(String[] args) {
		SpringApplication.run(LibrarianMsvc.class, args);
	}

}
