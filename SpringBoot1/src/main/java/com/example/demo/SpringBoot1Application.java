package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con =SpringApplication.run(SpringBoot1Application.class, args);
		
		Bus b=con.getBean(Bus.class);
		b.show();
	//	Car c=con.getBean(Car.class);
	//	c.disp();
	}
}