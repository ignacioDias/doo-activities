package output;
import primenumbers.PrimeNumberBruteForce;

import java.io.*;
import java.util.ArrayList;

public class BruteForceDisplay implements Output {

    public void saveFile(File file, PrimeNumberBruteForce primeNumberBruteForce, int number) {
        ArrayList<Integer> primes = primeNumberBruteForce.findPrimeNumbers(number);
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            ArrayList<Integer> primeNumbers = primeNumberBruteForce.findPrimeNumbers(number);
            for (Integer primeNumber : primeNumbers) {
                bufferedWriter.write(primeNumber.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Numbers saved correctly.");
        } catch (IOException e) {
            System.err.println("Error while writing on file: " + e.getMessage());
        }
    }

    public void output(File file) throws FileNotFoundException {
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
