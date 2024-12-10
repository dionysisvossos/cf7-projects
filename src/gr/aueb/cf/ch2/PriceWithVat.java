package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with VAT.
 */
public class PriceWithVat {
    public static void main(String[] args) {
        final double VAT_RATE = 0.24;
        double inputPrice = 0.0;
        double price = 0.0;
        double vat = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert price");
        inputPrice = in.nextDouble();
        vat = inputPrice * VAT_RATE;

        price = inputPrice + vat;

        System.out.printf("Price is: %.2f, VAT: %.2f, Price with VAT: %.2f",inputPrice, vat, price);


    }
}
