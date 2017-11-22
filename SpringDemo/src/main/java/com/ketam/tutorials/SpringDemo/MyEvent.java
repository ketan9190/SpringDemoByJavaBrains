package com.ketam.tutorials.SpringDemo;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

	public MyEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "----------------------------My event occured";
	}
}
