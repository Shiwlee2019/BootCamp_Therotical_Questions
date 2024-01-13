package com.Boot_Camp_Questions_Examples;

public class Students {

	int rollNo;
	String name;

	static String college = "PNT"; // static variable

	// constructor
	Students(int a, String b) {
		rollNo = a;
		name = b;
	}

	public void display() {
		System.out.println(rollNo + " " + name + " " + college);
	}

	public static void main(String[] args) {
		Students m1 = new Students(100, "Ahmad");
		Students m2 = new Students(101, "Shajahan");
		m1.display();
		m2.display();

	}

}
