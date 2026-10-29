package Loops;

import java.util.Scanner;

public class APpractice {
	
	public static void main(String[] args) {
//		 for( int i=99; i>=1; i=+i-4) {
//			 System.out.println(i);
//		 }
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		
		
		for( int i=1; i<=n; i++) {
			
			System.out.println(i);
		
			System.out.println(n);
			
			n= n-1;
		   	
		}
		
	}

}
