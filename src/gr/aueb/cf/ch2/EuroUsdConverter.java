package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *Converts the amount of Euros given by the User via
 * the std input, to US Dollars, with a fixed conversion rate.
 */
public class EuroUsdConverter {
    public static void main(String[] args) {
        int euro = 0;
        int dollar = 0;
        int cents = 0;
        int totalCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an integer amount (Euro)");
        euro = in.nextInt();

        totalCents = euro * PARITY;
        dollar = totalCents / 100;
        cents = totalCents % 100;

        System.out.printf("%d euros = %d usa dollars , %d usa cents", euro, dollar, cents);

    }

}
