package Loops;

import java.util.Scanner;

public class Prime_100 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 
		 
		 
		 
		 for(int i=2; i<=100; i++)
		 {
			 int a=0;
			 for(int j=2; j<i; j++) {
				 
				 if(i%j==0) {
					a=1; 
				 }
			 }
			 
			 if(a==0)System.out.println(i);

	}
}
}
