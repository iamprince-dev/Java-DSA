package Arrays;

import java.util.Scanner;

public class Search_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a element");
		int target=sc.nextInt();
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				flag=true;
							}
					}
		if(flag==true)System.out.println("Exist");
		else
			System.out.println("Not exist");
	}
}
