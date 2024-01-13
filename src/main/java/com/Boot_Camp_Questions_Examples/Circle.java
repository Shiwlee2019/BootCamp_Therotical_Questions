package com.Boot_Camp_Questions_Examples;
// Example of method overriding creating two classes Shape1 and Circle

class Shape1// parent class
{
	public void area() {
		System.out.println("area");
	}
}

//child class over write this method inside Cirle class
public class Circle extends Shape1 {
	public void area() {
		System.out.println("Circle");
	}

	public static void main(String[] args) {
		//creating object of Circle class giving reference of parent class which means child class
		//will execute 
		Shape1 s = new Circle();
		s.area();
	}
}
