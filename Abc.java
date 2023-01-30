package com.java;

import java.util.Scanner;

public class Abc {

	public void Min() { //method initiation 

		Scanner s = new Scanner(System.in); //taking input
		System.out.print("Enter first number :");
		int a = s.nextInt();
		System.out.print("Enter Second number :");
		int b = s.nextInt();
		System.out.print("Enter Third number :");
		int c = s.nextInt();

		if (a > b) { //Applying condition
			System.out.println("The minimum no. is " + b);
		} else if (b > c) {
			System.out.println("The minimun no. is " + c);
		} else {
			System.out.println("The minimun no. is " + a);
		}
	}

	public static void main(String[] args) {
		Abc abc = new Abc();//Creating object of class 
		abc.Min(); //calling the method

	}

}
