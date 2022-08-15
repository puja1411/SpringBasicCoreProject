package com.in28minutes.spring.basics.Springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.Springin5steps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringIn5StepsCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class);

		SomeCDIBusiness cdiBusiness = context.getBean(SomeCDIBusiness.class);
		LOGGER.info("{}", cdiBusiness);

	}

}
