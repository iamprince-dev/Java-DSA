package Loops;

import java.util.Scanner;

public class a_raiseTo_b {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter power");
		int power=sc.nextInt();
		int sum=1;
		for(int i=1; i<=power;i++) {
			sum=sum*a;
		}
		System.out.println(sum);
	}
}
