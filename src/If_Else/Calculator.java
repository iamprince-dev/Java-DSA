package If_Else;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
	

	
	 Scanner sc= new Scanner(System.in);
     System.out.println("Enter 1st number");
     int a = sc.nextInt();
     
     System.out.println("Enter your operator : +.-./,*");
      char ch= sc.next().charAt(0);
    
     
     System.out.println("Enter 2nd number");
     int b = sc.nextInt();
     
         
    if(  ch == '+') {
    	System.out.println(a+b);
    }
     else if(  ch == '-') {
    	System.out.println(a-b);
    }
     else if(  ch == '*') {
    	System.out.println(a*b);
    }
     else if(  ch == '/') {
    	System.out.println(a/b);
    }
}
	
}
