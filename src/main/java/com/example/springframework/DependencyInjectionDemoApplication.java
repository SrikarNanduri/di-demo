package com.example.springframework;

import com.example.springframework.controllers.InitialController;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		InitialController initialController = (InitialController) ctx.getBean("initialController");

		initialController.hello();

	}

}
