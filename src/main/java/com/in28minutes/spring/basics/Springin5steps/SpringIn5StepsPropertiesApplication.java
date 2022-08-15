package com.in28minutes.spring.basics.Springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.Springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringIn5StepsPropertiesApplication.class)) {
			SomeExternalService externalService = context.getBean(SomeExternalService.class);

			System.out.println(externalService.returnServiceURL());
		}
	}

}
