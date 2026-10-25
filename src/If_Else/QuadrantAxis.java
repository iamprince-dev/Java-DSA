package If_Else;

import java.util.Scanner;

public class QuadrantAxis {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x :");
		
		int x= sc.nextInt();
		
		System.out.println("Enter y :");
		int y = sc.nextInt();
		
		if( x==0 && y==0) {
			System.out.println("Origin");
		}
		else if( x>0 && y>0) {
			System.out.println("1st quadrant");
		}
		else if( x<0 && y>0) {
			System.out.println("2nd quadrant");
		}
		else if( x<0 && y<0) {
			System.out.println("3rd quadrant");
		}
		else if( x>0 && y<0) {
			System.out.println("4th quadrant");
		}
		else if(x>0 && y==0) {
			System.out.println("X axis");
		}
		else if( x==0 && y>0 ) {
			System.out.println("Y axis");
		}
				
				
	}
}
