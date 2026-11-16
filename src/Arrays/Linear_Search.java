package Arrays;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a element");
		int target=sc.nextInt();
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int found=-1;
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
			
				found=i;
				
				flag=true;
				break;
							}
					}
		if(flag==true)System.out.println("Exist "+found);
		else
			System.out.println("Not exist");
	}
}
