package Loops;

import java.util.Scanner;

public class Largest_Digit {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	int large=1;
	int rem=0;
	while(n!=0) {
		rem=n%10;
		if(rem>large) {
			large=rem;
		}
		n=n/10;
	}
    System.out.println(large);	
}
}
