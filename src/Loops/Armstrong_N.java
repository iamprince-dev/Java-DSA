package Loops;

import java.util.Scanner;

public class Armstrong_N {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 
		 int n= sc.nextInt();
		 for(int i=1;i<=n;i++){
			 	 
			 int rem=0;
			 int temp=i;
			 int arm=0;
			 int rev=1;
			int c=0;
			 while(i!=0) {
				 i=i/10;
			      c++; 	 
			 }
	     i=temp;
			 while(i!=0) {
				 rev=1;
				 rem= i%10;
				for(int j=1;j<=c;j++) {
					rev=rev*rem;
				}
				 arm=rev+arm;
				 i=i/10;
				 
			 }
			System.out.println(arm);
			 }

		 }
		}
