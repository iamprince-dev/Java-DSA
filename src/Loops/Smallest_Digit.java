package Loops;

import java.util.Scanner;

public class Smallest_Digit {

	 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			
			int small=9;
			int rem=0;
			while(n!=0) {
				rem=n%10;
				if(rem<small) {
					small=rem;
				}
				n=n/10;
			}
		    System.out.println(small);	
		}

}
