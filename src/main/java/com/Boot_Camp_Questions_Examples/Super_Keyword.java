package com.Boot_Camp_Questions_Examples;

public class Super_Keyword {

	class Animal {
		String color = "Brown";

		void eat() {
			System.out.println("Animal is Eating");
		}
	}

	class Dog extends Animal {
		String color = "White";

		void displaycolor() {
			System.out.println("Dog color" + color);
			System.out.println("Animal color" + super.color);
		}

		void eat() {
			super.eat();
			System.out.println("Dog is eating");
		}
	}

	public static void main(String[] args) {
		Super_Keyword SKE = new Super_Keyword();
		Dog mydog = SKE.new Dog();
		mydog.displaycolor();
		mydog.eat();

	}

}
