package Pattern_Printing;

import java.util.Scanner;

public class Star_Plus {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows");
		int n =sc.nextInt();
				
		for(int i=1;i<=n; i++) {
			for(int j=1;j<=n;j++) {
				
				if((n/2)+1==j||(n/2)+1==i) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
