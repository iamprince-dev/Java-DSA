package If_Else;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Cp:");
		
		int cp= sc.nextInt();
         
		System.out.println("Enter SP:");
		int sp= sc.nextInt();
		
		if(sp > cp) {
			System.out.println("profit "+(sp-cp)+" %"+(sp-cp)*100/sp) ;
		}
		else if(cp > sp) {
			System.out.println("loss"+(cp -sp)+"%" +(cp-sp)*100/cp);
		}
		else {
			System.out.println("No profit No loss");
		}
 }
}
