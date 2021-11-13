package com.method.overloading;

public class AddDemo {
	
	void add (double num1, int num2){
		 double sum = num1 +num2; 
		 System.out.println(sum); 
		}

		void add (double num1, double num2) {
		 double sum= num1 +num2;
		 System.out.println(sum);

		}

		void add(int num1, double num2) { 
		 double sum = num1 +num2; 
		 System.out.println(sum);

		}

		public static void main(String[] demo) {

		AddDemo obj = new AddDemo ();
		obj.add(10d, 20); 
		obj.add(15.5, 6);

		}

}
