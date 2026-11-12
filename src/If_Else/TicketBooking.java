
package If_Else;

public class TicketBooking {

    public void movie(int age, char seat, int week) {

        int baseprice = 0;
        int discount = 0;
        int finalprice = 0;

        if (seat == 'R') {
            baseprice = 200;
        }
        else if (seat == 'P') {
            baseprice = 300;
        }
        else {
            System.out.println("Please enter valid seat");
            return;
        }

               if (age > 60) {
            discount = baseprice * 30 / 100;
        }
        else if (age >= 13 && age <= 60) {
            discount = 0;
        }
        else if (age >= 5 && age < 13) {
            discount = baseprice * 50 / 100;
        }
        else if (age >= 0 && age < 5) {
            discount = baseprice * 100 / 100;
        }
        else {
            System.out.println("Please enter valid age");
            return;
        }

        finalprice = baseprice - discount;

                if (week == 0) {
            finalprice = finalprice + 50;
        }
        else if (week == 1) {
                    }
        else {
            System.out.println("Please enter valid weekdays");
            
        }

        System.out.println("Base Price: " + baseprice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalprice);
    }

    public static void main(String[] args) {

        TicketBooking aobj = new TicketBooking();

        aobj.movie(10, 'R', 1);
    }
}
