package Loops;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int fact=0;
		int original=n;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
			 fact= fact+i;	
			}
		}
		if(fact==original) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not perfect");
		}
	}
}
