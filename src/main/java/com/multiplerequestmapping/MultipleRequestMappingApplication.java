package com.multiplerequestmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class MultipleRequestMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleRequestMappingApplication.class, args);
	}

	@RequestMapping({"/", "/get"})
	public String getMessage(HttpServletRequest request) {
		String path = request.getRequestURI();
		String messgae = "Hi from App get by url /";

		if (path.equals("/get")) {
			messgae = "Hi from App get by url /get";
		}

		System.out.println("Path = " + path);
		return messgae;
	}

}
