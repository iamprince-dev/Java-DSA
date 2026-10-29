package Loops;

import java.util.Scanner;

public class Prime_Number {
 public static void main(String[] args) {
	
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a number");
	 
	 int n=sc.nextInt();
	 int x=0;
	 
	 boolean flag= true;
	 
	 for( int i=2; i<=Math.sqrt( n); i++) {
		 
		 if(n%i==0) {
			 
			 flag= false;
			// x=1; // composite
			  break;
		 }
	 }
	 
	 if(n==1)System.out.println("Either composite nor prime");
	 else if( flag==false)System.out.println("Not a prime number");
	 else System.out.println( "prime number");
	 System.out.println();

}
}
