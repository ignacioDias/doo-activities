package primenumbers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrimeNumberBruteForce implements PrimerNumbers{
    public ArrayList<Integer> findPrimeNumbers(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int number = 2;
        while(primes.size() < n) {
            if(isPrime(number))
                primes.add(number);
            number++;
        }
        return primes;
    }
    private boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
