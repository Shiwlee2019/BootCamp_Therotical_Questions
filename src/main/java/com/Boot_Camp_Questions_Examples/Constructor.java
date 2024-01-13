package com.Boot_Camp_Questions_Examples;

public class Constructor {

	int M;
	int N;

	public Constructor() { // constructor

		M = 100;
		N = 30;

	}

	public static void main(String[] args) {

		// created a object of class to call the constructor
		Constructor Myobj = new Constructor();

		System.out.println(Myobj.M + Myobj.N);
	}

}
