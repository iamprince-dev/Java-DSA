package If_Else;

import java.util.Scanner;

public class TernaryBasics {
 public static void main(String[] args) {

	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Entern a number");
	 int n = sc.nextInt();
	 
	 System.out.println((n % 2 == 0) ? "Even" : "Odd");
} 
}
