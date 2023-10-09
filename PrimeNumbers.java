package internshipvoc;
import java.util.*;
// Vault of Codes Java intersnhip p5
// Sarim Farooq


public class PrimeNumbers {
    public static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        /*
        in the program the condition to check prime no
        was wrong , i.e if the number is not divisible by any number less
        than it
         */

        for (int i = 2; i <= n; i++) {  // Iterate from 2 to n
            boolean isPrime = true;  // Assume i is prime initially
            if (i == 2) {  // Special case for 2, whhich is the only even prime
                primes.add(i);  // Add 2 to the primes list
                continue;  // Move to the next iteration
            }
            // the 2nd loop and condition to check only till the root of the number
            for (int j = 2; j * j <= i; j++) {  // Check divisors up to the square root of i
                if (i % j == 0) {  // If i is divisible by j, it's not prime
                    isPrime = false;  // Update isPrime to false
                    break;  // Exit the inner loop
                }
            }
            if (isPrime) {  // If isPrime is still true, i is prime
                primes.add(i);  // Add i to the primes list
            }
        }
        return primes;  // Return the list of prime numbers
    }

    public static void main(String[] args) {
        int n = 20;
        List<Integer> primeNumbers = findPrimes(n);  // Find prime numbers up to n
        System.out.println("Prime numbers up to " + n + ": " + primeNumbers);  // Print the prime numbers
    }
}
