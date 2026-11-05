package Loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n= sc.nextInt();
		 int original=n;
		 int rem=0;
		 int rev=0;
		 int i=0;
		 while(n!=0) {
			 
			 rem = (n%10);
			 rev= (rev*10)+rem;
			 n = n/10;
			 i++;
		 }
		 if(rev == original) {
			 System.out.println("Palindrome");
		 }
		 else {
			 System.out.println("Not a palindrome");
		 }
	}

}
