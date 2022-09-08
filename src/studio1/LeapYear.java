package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose a year to test:");
		int y = in.nextInt();
		
		boolean LeapYear = (y%4==0) && (y%100!=0 || y%400==0);
		System.out.println(y + " is a leap year: " + LeapYear);
	}

}
