package com.in28minutes.spring.basics.componetnscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentPersonDAO {

	@Autowired
	private ComponetJDBCConnection jdbcConnection;

	public ComponetJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponetJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

//	@PostConstruct
//	public void testPostConstruct() {
//		System.out.println("After creating the container");
//	}
//
//	@PreDestroy
//	public void testPreDestroy() {
//		System.out.println("Before Destroying the container");
//	}

}
