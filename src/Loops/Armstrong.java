package Loops;

import java.util.Scanner;

public class Armstrong {
  
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 
		 int n= sc.nextInt();
		 
		 int rem=0;
		 int temp=n;
		 int arm=0;
		 int rev=1;
		int c=0;
		 while(n!=0) {
			 n=n/10;
		      c++; 	 
		 }
      n=temp;
		 while(n!=0) {
			 rev=1;
			 rem= n%10;
			for(int i=1;i<=c;i++) {
				rev=rev*rem;
			}
			 arm=rev+arm;
			 n=n/10;
			 
		 }
		 if(arm == temp) {
			 System.out.println("Armstrong");
		 }
		 else {
			 System.out.println("Not a Armstrong");
		 }

		 }

}
