package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus {
	
	public Bus() {
		
	}
	@Override
	public String toString() {
		return "Bus [number=" + number + ", name=" + name + ", route=" + route + "]";
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	private int number;
	private String name;
	private String route;
	@Autowired
	private Car car;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public void show()
	{
		System.out.println("Hello");
		car.disp();
	}
	
	
}
