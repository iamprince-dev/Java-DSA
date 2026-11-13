package Arrays;

import java.util.Scanner;

public class Sum_And_Max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;                 // sum of array
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
		}
		System.out.println(sum);
		int max= arr[0];

		for(int i=0;i<n;i++) {       // max of array
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print("max element : "+max);

		
	}
}
