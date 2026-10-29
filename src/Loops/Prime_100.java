package Loops;

import java.util.Scanner;

public class Prime_100 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 
		 int n=sc.nextInt();
		 for(int i=2; i<n; i++) {
			 
			 if(n%i !=0 && i==n) {
				 System.out.println();
			 }
		 }
		 
		
	}
}
