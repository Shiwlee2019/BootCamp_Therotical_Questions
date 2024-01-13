package com.Boot_Camp_Questions_Examples;

public class Interface_Keyword {
	 interface Vehicle{
	 void start();
	 void stop();
	}
	 static class Car implements Vehicle{
	 private String model;
	 
	 public Car(String model) {
		 this.model = model;
		 
	 }
	 @Override
	 public void start() {
		 System.out.println(model +" "+ "Is Starting");
	 }
	 @Override
	 public void stop() {
		 System.out.println(model +" "+ "Is Stopping");
	 }
	 
	}
	 static class MotorBike implements Vehicle{
	  private String brand;
	  
	  public MotorBike(String brand) {
		  this.brand = brand;
	  }
	  @Override
	  public void start() {
		  System.out.println(brand +" "+ "MotorBike is Starting");
	  }
	  @Override
	  public void stop() {
		  System.out.println(brand +" "+ "MotorBike is Stopping");
	  }

		public static void main(String[] args) {
			Car mycar = new Car("Benz");
			MotorBike mybike = new MotorBike("yamaha");
			
			mycar.start();
			mycar.stop();
			
			mybike.start();
			mybike.stop();
		

	}
	  }
	}

