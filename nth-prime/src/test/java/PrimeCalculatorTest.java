import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


import org.junit.jupiter.api.Test;

public class PrimeCalculatorTest {

    private PrimeCalculator primeCalculator = new PrimeCalculator();

    @Test
    public void testFirstPrime() {
        assertThat(primeCalculator.findNthPrime(1)).isEqualTo(2);
    }

    @Test
    public void testSecondPrime() {
        assertThat(primeCalculator.findNthPrime(2)).isEqualTo(3);
    }

    @Test
    public void testSixthPrime() {
        assertThat(primeCalculator.findNthPrime(6)).isEqualTo(13);
    }

    @Test
    public void testBigPrime() {
        assertThat(primeCalculator.findNthPrime(10001)).isEqualTo(104743);
    }

    @Test
    public void testUndefinedPrime() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> primeCalculator.findNthPrime(0));
    }

}
