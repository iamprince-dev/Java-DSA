package Loops;

import java.util.Scanner;

public class Armstrong {
  
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 
		 int n= sc.nextInt();
		 int original=n;
		 int rem=0;
		 int arm=0;
		
		 while(n!=0) {
			 
			 rem=n%10;
			 arm=arm+rem*rem*rem;
			 n=n/10;
			 
		 }
		 if(arm == original) {
			 System.out.println("Armstrong");
		 }
		 else {
			 System.out.println("Not a Armstrong");
		 }

		 }

}
