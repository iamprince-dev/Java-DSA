package If_Else;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter 1st number");
		int a= sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b= sc.nextInt();


		System.out.println("Enter 3rd number");
		int c= sc.nextInt();

		
		if( a>=b && a>=c) {
			System.out.println( a);
		}	
		else if( b>=a && b>=c) {
			System.out.println( b);
	   }
		else {
			System.out.println(  c);
		}
		
		
//		if( a>=b) {                            // nested if esle:
//			if( a>=c) System.out.println(a);	
//			else  // c > a
//				System.out.println(c);
//			}
//		
//		else{   // b > a
//			if( b>=c )System.out.println(b);
//			else  // c > b
//				System.out.println(c);
//		}
	}
}
