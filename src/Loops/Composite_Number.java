package Loops;

import java.util.Scanner;

public class Composite_Number {
	
	public static void main(String[] args) {
		

	
	Scanner sc =new Scanner(System.in);
	
   System.out.println(" Enter a number");
   
   int n = sc.nextInt();
   
   boolean  flag = true; // prime number
//     int x=0;
     
   for( int i=2; i<=n-1; i++) {
	   
	   if( n%i== 0) {
		   
		   flag= false; // composite number
		 //  x=1;
		   break;
	   }
   }
   
   if(n==1)System.out.println("Either composite nor prime");
//   else if(x==1)System.out.println("either composite");
//   else System.out.println("prime");
   else if( flag==false)System.out.println(" Composite number");
   else System.out.println("Prime number");
//   

}
}