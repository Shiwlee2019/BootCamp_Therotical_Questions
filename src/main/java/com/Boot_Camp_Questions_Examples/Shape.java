package com.Boot_Camp_Questions_Examples;

public class Shape {
	public static void main(String[] args) {
		Shape s = new Shape();//here we created the object of the Shape class
		s.area("circle");// calling the method
		s.area("cirlce", "triangle");
		s.area("cirlce", "triangle","rectriangle");
	}
	/*This class contains more than one  method with same method name but parameters are different or argument list are different
	 * which is called method overloading
	 */
public void area(String Circle) {
		
		System.out.println("Circle");
	}
public void area(String Circle, String Triangle) {
	
	System.out.println("Circle and Traingle");
}
public void area(String Circle, String Triangle, String Rectriangle ) {
	
	System.out.println("Circle,Traingle and Rectriangle");
}

}
