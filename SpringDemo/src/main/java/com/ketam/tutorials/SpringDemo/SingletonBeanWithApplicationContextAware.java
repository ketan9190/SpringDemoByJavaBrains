package com.ketam.tutorials.SpringDemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SingletonBeanWithApplicationContextAware implements ApplicationContextAware {

	private PrototypeBean prototypeBean;
	private ApplicationContext applicationContext;

	public PrototypeBean getPrototypeBean() {
		return (PrototypeBean) applicationContext.getBean("prototypeBean");
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.applicationContext = context;
	}

}
