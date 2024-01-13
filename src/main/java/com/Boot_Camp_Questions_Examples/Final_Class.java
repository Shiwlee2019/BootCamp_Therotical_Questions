package com.Boot_Camp_Questions_Examples;
//when we make class final that means no one can extends it, its stopping the inheritance
final class Calc{
	public void show() {
		System.out.println("in Calc show");
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
//class Advanc extends Calc{ 
//once it will stop the class to inheritance}
public class Final_Class {
	public static void main(String[] args) {
		Calc obj =new Calc();
		obj.show();
		obj.add(5,6);
	}
}
