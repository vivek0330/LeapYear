package com.LeapYear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		// get a 4 digit value from user
		int year;
		System.out.print("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified year is not a leap year");
	}

}

