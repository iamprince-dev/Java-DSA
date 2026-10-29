package Loops;

import java.util.Scanner;

public class AP {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number");
	
	int n= sc.nextInt();
	
//	for( int i=2; i<=3*n-3 ; i+=3) {
//		System.out.println(i);
//	}
	 
	int a= 2, r =4;
	
	for( int i=1; i<=n ; i++) {
		System.out.println(a);
		
	
		a= a+r;
		r= r*2;

		
		
	}
}
}
