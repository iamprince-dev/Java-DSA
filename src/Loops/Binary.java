package Loops;

import java.util.Scanner;

public class Binary {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n= sc.nextInt();
		 int rem=0;
		 int rev=0;
		 int rem2=0;
		 int rev2=0;
		 
		 
		 
		 
		 
		 while(n!=0) {
			 rem = (n%2);
			 rev= (rev*10)+rem;
			 n = n/2;
			 
		 }
		
		// System.out.println(rev);
		 int n2=rev;
			 
		 
	 while(n2!=0) {
		 rem2 = (n2%10);
		 rev2= (rev2*10)+rem2;
		 n2 = n2/10;
		 
	 }
	
	 System.out.println(rev2);

}

}
