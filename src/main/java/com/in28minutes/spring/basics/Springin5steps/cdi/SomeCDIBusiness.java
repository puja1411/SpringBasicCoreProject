package com.in28minutes.spring.basics.Springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

	@Inject
	private SomeCdiDao cdiDao;

	public SomeCdiDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(SomeCdiDao cdiDao) {
		this.cdiDao = cdiDao;
	}

}
