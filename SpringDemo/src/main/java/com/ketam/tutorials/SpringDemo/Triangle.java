package com.ketam.tutorials.SpringDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationEventPublisherAware {

	String type;
	int height;
	@Autowired
	@Qualifier("point2")
	Point pointA;
	@Resource
	Point pointB;
	private ApplicationEventPublisher publisher;

	public Triangle() {
		System.out.println("default const");
	}

	public Triangle(String type, int height, Point p) {
		System.out.println("1 arg String const is called");
		this.type = type;
		this.pointA = p;
	}

	public Triangle(int height, String type) {
		System.out.println("2 arg String const is called");
		this.type = type;
	}

	public Triangle(Point pointB) {
		System.out.println("point const");
		this.pointA = pointB;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	@Override
	public String toString() {
		publisher.publishEvent(new MyEvent(this));
		return "Triangle [type=" + type + ", height=" + height + ", pointA=" + pointA + ", pointB=" + pointB + "]";

	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

}
