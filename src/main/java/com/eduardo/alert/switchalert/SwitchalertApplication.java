/*
The app starts from here
This makes spring boot scan this package for componets and turn on scheduled task
Wires everthing up to be ready to handle HTTP request, scheduled jobs and database access
 */ 

package com.eduardo.alert.switchalert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling

public class SwitchalertApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwitchalertApplication.class, args);
	}

}
