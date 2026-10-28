package If_Else;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 digit number");
		int n= sc.nextInt();
		
		int digit1 = n/10;
		
		int digit2 = n% 10;
		
		int sum= digit1 + digit2;
		
		System.out.println("Sum :"+ sum);
		
	}
}
