

package If_Else;

import java.util.Scanner;

public class MakeMyTrip {

    public static int calculateFinalFare(int baseFare, int taxAmount) {
        int total = baseFare + taxAmount;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baseFare = sc.nextInt();
        int taxFare = sc.nextInt();

        if (baseFare >= 0 && taxFare >= 0) {
            System.out.println(
                MakeMyTrip.calculateFinalFare(baseFare, taxFare)
            );
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
