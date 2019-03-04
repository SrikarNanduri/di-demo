package com.example.springframework;

import com.example.springframework.controllers.ConstructorInjectedController;
import com.example.springframework.controllers.InitialController;
import com.example.springframework.controllers.PropertyInjectedController;
import com.example.springframework.controllers.SetterInjectedController;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		InitialController initialController = (InitialController) ctx.getBean("initialController");

		initialController.hello();
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}

}
