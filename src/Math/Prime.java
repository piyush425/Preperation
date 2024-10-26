package Math;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public static void main(String[] args) {
        int n=24;
        System.out.println(Math.sqrt(n));
    }

    /**
     * int n=24;
     *         while (!isPrime(n)){
     *              n=sumOfPrimeFactors(n);
     *
     *         }
     *
     *         System.out.println(Math.sqrt(24));
     */

    public static int sumOfPrimeFactors(int number) {
        List<Integer> primeFactors = getPrimeFactors(number);
        int sum = 0;
        for (int factor : primeFactors) {
            sum += factor;
        }
        return sum;
    }

    // Method to get the prime factors of a number
    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  // Corrected condition
                return false;
            }
        }
        return true;
    }

}
