package primenumbers;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrimeNumbersEratostenes implements PrimerNumbers {
    public ArrayList<Integer> findPrimeNumbers(int n) {
        ArrayList<Integer> primes = new ArrayList<>(); // Initialize an empty list to store prime numbers
        primes.add(2); // Add 2 as the first prime number
        int num = 3; // Start checking for prime numbers from 3
        while (primes.size() < n) { // Keep searching until we find N prime numbers
            boolean is_prime = true; // Assume the current number is prime until proven otherwise
            for(int i = 0; i < primes.size(); i++) {
                if (num % primes.get(i) == 0) { // If the current number is divisible by any previously found prime numbers
                    is_prime = false; // Then it is not a prime number
                    break; // Exit the loop since we've already proven it's not prime
                }
            }
            if (is_prime) { // If the current number is still prime after checking all previously found prime numbers
                primes.add(num); // Add it to our list of prime numbers
            }
            num += 2; // Check the next odd number (since even numbers other than 2 are not prime)
        }
        return primes;
    }
    public void displayPrimeNumbers(int number) {
        ArrayList<Integer> primes = findPrimeNumbers(number);
        for(Integer prime : primes) {
            System.out.println(prime);
        }
    }
}