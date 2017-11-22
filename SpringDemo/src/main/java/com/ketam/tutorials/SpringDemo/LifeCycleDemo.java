package com.ketam.tutorials.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleDemo
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	String messageC;
	String messageS;

	public LifeCycleDemo() {
		System.out.println("default LifeCycleDemo constructor");
	}

	public LifeCycleDemo(String messageC) {
		super();
		System.out.println("1messageC LifeCycleDemo constructor");
		System.out.println(messageC);
		this.messageC = messageC;
	}

	public String getMessageS() {
		return messageS;
	}

	public void setMessageS(String messageS) {
		System.out.println("2setMessageS LifeCycleDemo");
		System.out.println(messageS);
		this.messageS = messageS;
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("5setApplicationContext");

	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("4setBeanFactory");
	}

	public void setBeanName(String arg0) {
		System.out.println("3setBeanName : " + arg0);
	}

	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("6afterPropertiesSet");
	}

	@PostConstruct
	public void customInit() {
		System.out.println("customInit");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("customDestroy");
	}
}
