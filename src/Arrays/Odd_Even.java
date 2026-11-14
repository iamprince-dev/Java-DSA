package Arrays;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		int []arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		print(arr);
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==1) {
				
				arr[i] *=2;
			}
			else {
				arr[i] +=10;
			}
				
					}
		print(arr);
		
	}
	public static void print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
