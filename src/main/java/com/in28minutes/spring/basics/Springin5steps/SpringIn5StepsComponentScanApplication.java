package com.in28minutes.spring.basics.Springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componetnscan.ComponentPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.componetnscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class);

		ComponentPersonDAO personDAO = context.getBean(ComponentPersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		ComponentPersonDAO personDAO1 = context.getBean(ComponentPersonDAO.class);
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());

	}

	private static void AnnotationConfigApplicationContext(Class<SpringIn5StepsComponentScanApplication> class1) {
		// TODO Auto-generated method stub

	}

}
