package com.qa.BootCamp_Diffiult_Programs;

import java.util.Arrays;

class Person implements Comparable<Person>{
	 String name;
	 int age;
	 
	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 @Override
	 public int compareTo(Person other) {
		return Integer.compare(this.age,other.age);
		 
	 }
	 @Override
	 public String toString() {
		return "person{name='"+name+"', age="+age+'}';
		 
	 }
	
}
public class Quicksort_algorithm {
	public static <T extends Comparable <T>> void quicksort(T[] array, int low,int high){
		  if(low < high) {
			   int pivotIndex = partition(array, low, high);
			   
			   quicksort(array, low, pivotIndex -1);
			   quicksort(array, pivotIndex + 1, high);
		  }
	}
	public static <T extends Comparable <T>> int partition(T[] array, int low,int high){
		T pivot = array[high];
		int i = low -1;
		
		for(int j = low; j < high; j++) {
			if(array[j].compareTo(pivot)<=0) {
				i++;
				
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		T temp = array[i +1];
		array[i + 1] = array[high];
		array[high] = temp;
		
		return i + 1;
	}

	public static void main(String[] args) {
		 
		Person[]people = {
				new Person("Shiwlee",38),
				new Person("Ahmed", 40),
				new Person("Mashrufa",33),
				new Person("Roly", 42),
				new Person("Shajahan", 35),
				
		};
		System.out.println("Array before sorting:");
	
		System.out.println(Arrays.toString(people));
				
		quicksort(people, 0, people.length -1);
		 
		System.out.println("\nArray after sorting based on age:");
		System.out.println(Arrays.toString(people));
		
		

	}

}



