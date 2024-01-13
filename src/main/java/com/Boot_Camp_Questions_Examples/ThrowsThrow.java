package com.Boot_Camp_Questions_Examples;

import java.io.FileNotFoundException;

public class ThrowsThrow {

	public static void main(String[] args) {
		try {
			Work();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void Work() throws FileNotFoundException {
		throw new FileNotFoundException();

	}

}
