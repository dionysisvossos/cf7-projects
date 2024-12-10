package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18.
 * Ελέγχει αν μια ηλικία έχει δικαίωμα
 * να ψηφίσει.
 */

public class VoteEligible {
    public static void main(String[] args) {
        final int MIN_VOTING_AGE = 18;
        int votingAge = 0;
        boolean isEligible = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert age");
        votingAge = scanner.nextInt();

        //isEligible
        isEligible = votingAge >= MIN_VOTING_AGE;

        System.out.println("Age is eligible: " + isEligible);


    }
}
