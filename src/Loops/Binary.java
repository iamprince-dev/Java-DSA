package Loops;

import java.util.Scanner;

public class Binary {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n= sc.nextInt();
		 int rem=0;
		 int rev=0;
		 
		 int place=1;
		 
		 while(n!=0) {
			 rem = (n%2);
			 rev= rev+(rem*place);
			 place= place*10;
			 n = n/2;
			 
		 }			 
		 
	 	
	 System.out.println(rev);

}

}
