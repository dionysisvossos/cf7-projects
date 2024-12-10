package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει μέρες, ώρες, λεπτά, δευτερόλεπτα
 * σε συνολικά δευτερόλεπτα. Ο χρήστης δίνει τα δεδομένα
 * και εκτυπώνει το τελικό αποτέλεσμα.
 */
public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;
        int inputDays;
        int inputMinutes;
        int inputHours;
        int inputSeconds;
        int totalSeconds;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Παρακαλώ εισάγετε τις μέρες, ώρες, λεπτά και δευτερόλεπτα");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SECONDS_PER_DAY + inputHours * SECONDS_PER_HOUR +
                inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf("Total Seconds: %,d seconds\n", totalSeconds);
    }
}
