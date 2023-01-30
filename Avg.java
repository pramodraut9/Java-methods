package com.java;

import java.util.Scanner;

public class Avg {

	public void Average() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 1st number :");
		double no1 = s.nextDouble();
		System.out.print("Enter the 2nd number :");
		double no2 = s.nextDouble();
		System.out.print("Enter the 3rd number :");
		double no3 = s.nextDouble();

		double avg = no1 + no2 + no3 / 3;
		System.out.println("Average is "+avg);
	}

	public static void main(String[] args) {

		Avg ag = new Avg();
		ag.Average();
	}

}
