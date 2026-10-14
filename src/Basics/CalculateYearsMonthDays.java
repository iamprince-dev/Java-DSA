package Basics;

import java.util.Scanner;

public class CalculateYearsMonthDays {
   
	public static void main(String[] args) {
	
Scanner sc= new Scanner (System.in);
		
         System.out.println("Enter the numbers of days");
		int n = sc.nextInt();
		  
		int yr = n/ 365;
		
		int b=  n% 365;
		
		int week= b/7;
		
		int day= b%7;
		
		System.out.println("Year :" +yr);
		System.out.println("weeks:" +week);
		System.out.println("Days :" +day);

		
	}
}
