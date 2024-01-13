package com.Boot_Camp_Questions_Examples;

interface Addable {
	int add(int s, int k);
}

public class LambdaExpression {
	public static void main(String[] args) {

		Addable ad1 = (s, k) -> (s + k);
		System.out.println(ad1.add(10, 20));

		Addable ad2 = (int s, int k) -> {
			return (s + k);
		};
		System.out.println(ad2.add(120, 200));
	}
}
