package If_Else;

import java.util.Scanner;

public class CheckCharaterType {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a character");
		char ch= sc.next().charAt(0);
		
	     int value= (int)ch;
	     System.out.println("ascii:"+ value);
		
		
		if( value >=65 && value<= 90 ) {
			System.out.println("Upper case");
		}
		else if( value >= 97 && value <= 122) {
			System.out.println("lower case");
		}
		else if( value >= 48 && value <= 57) {
			System.out.println("digit");
		}
		
		else { System.out.println("special character");
		
		}
	}
}
