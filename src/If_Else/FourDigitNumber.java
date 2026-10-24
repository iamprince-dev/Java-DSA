package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter a number :");
	 
	 int n= sc.nextInt();
	 
//	 if(n > 999 && n < 10000) {
//		 System.out.println("4 digit");
//	 }
//	 else {
//		 System.out.println("not 4 digit");
//	 }
	 
	 if(n%5 == 0 || n%3 == 0) {
		 System.out.println("Divisible by 5 or 3");
	 }
	 
	 else {
		 System.out.println("Not divisible by 5 or 3");
	 }
}
}
