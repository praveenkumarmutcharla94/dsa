package basics;

import static java.lang.System.exit;

public class FindSquareRoot {

    public static void main(String[] args) {

        int num = 84630800;
        int sqrtNum = (int)findSquareRoot(num);
        if (sqrtNum*sqrtNum == num) {
            System.out.println("perfect square root");
        } else {
            System.out.println("not a perfect square root");
        }


    }

    private static double findSquareRoot(int x) {

        if (x < 0) {
            throw new IllegalArgumentException("Cannot compute the square root of a negative number.");
        }

        double epsilon = 1e-10; // Tolerance level for approximation
        double guess = x;
        double sqrtGuess = (guess + x / guess) / 2.0;

        while (Math.abs(guess - sqrtGuess) > epsilon) {
            guess = sqrtGuess;
            sqrtGuess = (guess + x / guess) / 2.0;
        }

        return sqrtGuess;
    }
}
