package com.Boot_Camp_Questions_Examples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
	
	public static void main(String[] args) throws FileNotFoundException  {
		//System.out.println(5/0);// runtime exception 
		FileReader file = new FileReader("somefile.txt");//compile time
	}
}
