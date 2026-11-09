package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 number");
		int a=sc.nextInt();
		System.out.println("Enter 1 number");
		int b=sc.nextInt();
		System.out.println("Enter 1 number");
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(Math.max(Math.max(a, b),Math.max(c,d)));
	}

}
