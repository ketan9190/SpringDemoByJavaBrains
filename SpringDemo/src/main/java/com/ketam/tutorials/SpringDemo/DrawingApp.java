package com.ketam.tutorials.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		// Triangle t = new Triangle();// this is harcoded object which spring
		// container is not aware of
		/*
				BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
				Triangle t = (Triangle) factory.getBean("triangle");*/

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		((AbstractApplicationContext) context).registerShutdownHook();

		LifeCycleDemo lifecycledemo = (LifeCycleDemo) context.getBean("lifecycle");

		Triangle t = (Triangle) context.getBean("triangle");
		System.out.println(t);

		SingletonBeanWithApplicationContextAware sb = (SingletonBeanWithApplicationContextAware) context
				.getBean("singletonBeanPT");
		System.out.println(sb);
		System.out.println(sb.getPrototypeBean());
		System.out.println(sb.getPrototypeBean());

		SingletonBean sb1 = (SingletonBean) context.getBean("singletonBean");
		System.out.println(sb1);
		System.out.println(sb1.getPrototypeBean());
		// to display the message using message source
		System.out.println(context.getMessage("greeting", null, "default message", null));
	}

}
