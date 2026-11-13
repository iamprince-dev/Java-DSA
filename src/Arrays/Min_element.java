package Arrays;

import java.util.Scanner;

public class Min_element {
  public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size of array");
	int n=sc.nextInt();
	
	int []arr= new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int min =arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println( "Min elemnt: "+min);
}
}
