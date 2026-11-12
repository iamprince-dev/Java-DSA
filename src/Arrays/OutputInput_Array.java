package Arrays;

import java.util.Scanner;

public class OutputInput_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int []arr= {23,45,56,70,-90,-66};
//		
//		int n= arr.length;
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//		System.out.println();
		
	int	[]sonal= new int[7];
		
		for(int i=0;i<7;i++) {
			  sonal[i]=sc.nextInt();
			}

		
		   //default value
		for(int i=0;i<7;i++) {
			System.out.print(sonal[i]*2+" ");
		}
		
			}
}
 