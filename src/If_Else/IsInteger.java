package If_Else;

import java.util.Scanner;

public class IsInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number");
		
		double n= sc.nextDouble();
		
//	     int x= (int)n;
		
		
	//	if(n-(int)n == 0) {
		
		if(n == (int)n) {
			System.out.println("Is  integer");
		}
		else {
			System.out.println("Not an interger");
		}
	}
}
