package If_Else;

import java.util.Scanner;

public class Student {
 public static void main(String[] args) {
	
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a number");
	 
	 int n = sc.nextInt();
	 
	 if( n%3 == 0 && n%5==0)
	 {System.out.println("Sonal");
	 }
	 
	 
	 else if( n%3==0 ) {
		 System.out.println("Aman");
	 }
	 
	 else if(n %5== 0 ) {
		 System.out.println("Amit");
	 }
	 
	 	 
	 else
	 {
		 System.out.println("Prince");
	 }
	 
}
}
