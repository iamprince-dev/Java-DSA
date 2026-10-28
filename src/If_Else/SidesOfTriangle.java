package If_Else;

import java.util.Scanner;

public class SidesOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side 1st");
		int a= sc.nextInt();
		
		System.out.println("Enter side 2nd");
		int b= sc.nextInt();
		
		System.out.println("Enter side 3rd");
		int c= sc.nextInt();
		
		if( a+b>c && b+c>a && a+c>b) {
			System.out.println("Sides of  triangle");
		}
		else {
			System.out.println("Not sides of  triangle");
		}
		 
	}
}
