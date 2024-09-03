package basics;

import static java.lang.System.exit;

public class isPrime {

    public static void main(String[] args) {

        int A = 8;
        int itr = 2;
        int aSqrt = (int)Math.sqrt(A);
        System.out.println(aSqrt);

        while (itr <= aSqrt) { // Corrected to ensure aSqrt case is handled separately
            if (A % itr == 0) {
                System.out.println("0");
                exit(1);
            }
            itr++;
        }
        System.out.println("1");



    }
}
