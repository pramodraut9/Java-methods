package com.java;

import java.util.Scanner;

public class Digitsum {
	int num;
	int result;
	
	Scanner sc =new Scanner(System.in);
	
	public int Sumofdigit() {
	System.out.println("Enter the num :");
	num= sc.nextInt();
	
	while(num > 0) {
		result += num % 10;
		num /= 10;
	}
	
	return result;
	
	}

	public static void main(String[] args) {
	

		Digitsum ds=new Digitsum();
		System.out.println(ds.Sumofdigit());
	}

}
