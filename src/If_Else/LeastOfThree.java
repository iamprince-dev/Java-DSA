package If_Else;

import java.util.Scanner;

public class LeastOfThree {
 public static void main(String[] args) {
	
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter 1st number");
	 int a = sc.nextInt();
	 
	 System.out.println("Enter 2nd number");
	 int b = sc.nextInt();

	 
	 System.out.println("Enter 2nd number");
	 int c = sc.nextInt();
	 
	 
//	 if( a<=b) {                           // nested if else
//		 if( a<=c)System.out.println(a);
//		 else System.out.println(c);
//	 }
//	 else {
//		 if(b<=c)System.out.println(b);
//		 else System.out.println(c);	 
//	 }
	 
	 
	 if( a<=b && a<=c ) {
		 System.out.println(a);
	 }
	 else if( b<=a && b<=c) {
		 System.out.println(b);
	 }
	 else {
		 System.out.println(c);
	 }

}
}
