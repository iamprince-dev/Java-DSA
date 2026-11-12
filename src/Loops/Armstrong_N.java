package Loops;

import java.util.Scanner;

public class Armstrong_N {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 
		 int n= sc.nextInt();
		 for(int num=1;num<=n;num++){
			 	 
			 int rem=0;
			 int temp=num;
			 int arm=0;
			 int rev=1;
			int c=0;
			 while(temp!=0) {
				 temp=temp/10;
			      c++; 	 
			 }
	     temp=num;
			 while(temp!=0) {
				 rev=1;
				 rem= temp%10;
				for(int j=1;j<=c;j++) {
					rev=rev*rem;
				}
				 arm=rev+arm;
				 temp=temp/10;
				 
			 }
			 if(arm==num)
			System.out.println(arm);
			 }

		 }
		}
