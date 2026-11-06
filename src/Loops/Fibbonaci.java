package Loops;

import java.util.Scanner;

public class Fibbonaci {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	
	int a=0,b=1,c=0;
	
	for(int i=1;i<=n;i++) {
		
		System.out.println(c);
		c=a+b;
		b=a;
		a=c;
		
		
	}
	
}
}
