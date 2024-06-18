package primenumbers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;

public class PrimeNumberBruteForceTests {
    @Test
    public void testPrimeNumber() {
        PrimeNumbersEratostenes primeNumbersEratostenes = new PrimeNumbersEratostenes();
        ArrayList<Integer> primeNumbers = primeNumbersEratostenes.findPrimeNumbers(7);
        ArrayList<Integer> expectedPrimeNumbers = new ArrayList<>();
        expectedPrimeNumbers.add(2);
        expectedPrimeNumbers.add(3);
        expectedPrimeNumbers.add(5);
        expectedPrimeNumbers.add(7);
        expectedPrimeNumbers.add(11);
        expectedPrimeNumbers.add(13);
        expectedPrimeNumbers.add(17);
        assertThat(primeNumbers).isEqualTo(expectedPrimeNumbers);
        PrimeNumberBruteForce primeNumberBruteForce = new PrimeNumberBruteForce();
        ArrayList<Integer> primeNumbers2 = primeNumberBruteForce.findPrimeNumbers(7);
        assertThat(primeNumbers).isEqualTo(primeNumbers2);
    }
}
