package Arrays;

import java.util.Scanner;

public class Second_Max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max= arr[0];
        int smax= arr[0];
		for(int i=0;i<n;i++) {       // max of array
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
		
		}
		for(int i=0;i<n;i++) {       // max of array
			if(arr[i]>smax && arr[i]<max) {
				
				smax=arr[i];
			}
		
		}
		System.out.print("Secondmax element : "+smax);

		
	}

}
