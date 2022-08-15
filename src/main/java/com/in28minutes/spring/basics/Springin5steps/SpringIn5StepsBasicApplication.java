package com.in28minutes.spring.basics.Springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.Springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);

			int result = binarySearch.binarySearch(new int[] { 12, 3, 4 }, 3);
			System.out.println(result);
		}
	}

}
