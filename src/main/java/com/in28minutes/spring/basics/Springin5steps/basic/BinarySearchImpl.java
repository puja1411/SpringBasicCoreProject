package com.in28minutes.spring.basics.Springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.basics.Springin5steps.SpringIn5StepsBasicApplication;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
	@Autowired
//	@Qualifier("BubbleSortAlgorithm")
	private SortAlgorithm sortAlogorithm;

	public BinarySearchImpl(SortAlgorithm sortAlogorithm) {
		this.sortAlogorithm = sortAlogorithm;
	}

	public int binarySearch(int a[], int number) {
		try {
			LOGGER.info("{}", sortAlogorithm);
			sortAlogorithm.sort(a);

		} catch (Exception e) {
			LOGGER.error("Error Found");
		}
		return 3;
	}

}
