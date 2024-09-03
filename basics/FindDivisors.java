package basics;

public class FindDivisors {

    public static void main(String[] args) {

        int A = 12;
        int factors = 0;
        int itr = 1;
        int aSqrt = (int)Math.sqrt(A);
        System.out.println(aSqrt);

        while (itr < aSqrt) { // Corrected to ensure aSqrt case is handled separately
            if (A % itr == 0) {
                factors += 2; // Count both divisors
            }
            itr++;
        }

        if (aSqrt * aSqrt == A) { // Square root case
            factors++;
        } else if(A%aSqrt == 0) { //
            factors += 2;
        }

        System.out.println(factors);
    }
}
