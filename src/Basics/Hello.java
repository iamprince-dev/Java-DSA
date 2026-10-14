package Basics;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Scanner sc= new Scanner (System.in);
		
		int n = sc.nextInt();
		  
		int min = (n/ 60) %60;
		
		int hr =  min/ 60;
		
	    int sec = n % 60 ;
		 
		
	    System.out.println("hours :"+hr);
		System.out.println("minutes :"+min);
		System.out.println("seconds :"+sec);

		

		
			}
}
