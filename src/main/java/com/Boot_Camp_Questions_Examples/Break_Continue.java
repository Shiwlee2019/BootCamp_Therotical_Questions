package com.Boot_Camp_Questions_Examples;

/*public class Break_Continue {
	public static void main(String[] args) {
		
		 for (int i = 0; i < 10; i++) {
			    if (i == 5) {
			        break;	 }
			    System.out.println(i);
			}	 
	 }
}*/
public class Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
		    if (i % 2 == 0) {
		        continue;
		    }
		    System.out.println(i);
		}

	}
}


