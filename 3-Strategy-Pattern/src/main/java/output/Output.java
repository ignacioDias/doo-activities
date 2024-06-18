package output;

import primenumbers.PrimeNumberBruteForce;
import primenumbers.PrimerNumbers;

import java.io.File;
import java.io.FileNotFoundException;

public interface Output {
    public void saveFile(File file, PrimerNumbers algorithm, int number);
    public void output(File file) throws FileNotFoundException;
}
