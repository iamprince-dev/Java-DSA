package Loops;

import java.util.Scanner;

public class Fibbonaci {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	
	int a=0,b=1,c=0;
	int i=1;
	while(c<=n) {
		c=a+b;
		System.out.println(c);
		a=b;
		c=a;
		
		
	}
	i++;
}
}
