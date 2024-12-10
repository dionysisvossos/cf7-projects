package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων με τη χρήση μεθόδων.
 */
public class AddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;

        System.out.println("please enter two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a, b);
        sub = sub(a, b);

        System.out.println(sum);
        System.out.println(sub);

    }

    /**
     * Adds two integers.
     *
     * @param a the first integer.
     * @param b the second integer.
     * @return the sum of the two integers.
     */

    public static int add(int a, int b) {
//        int result = 0;
//        result = a + b;
//        return result;

        return a + b;
    }

    /**
     * Subtracts two integers.
     * @param a the first integer to subtract from.
     * @param b the second integer to be subtracted.
     * @return the difference of the subtraction
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}