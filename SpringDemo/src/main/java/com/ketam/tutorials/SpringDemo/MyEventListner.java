package com.ketam.tutorials.SpringDemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListner implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString() + " ::::::::::::::::::::: has occured");
	}

}
