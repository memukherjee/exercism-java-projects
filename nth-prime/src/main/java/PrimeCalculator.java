import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PrimeCalculator {
    static List<Integer> primes = new ArrayList<>();
    static int MAXIMUM_POSSIBLE_PRIME_NUMBER = 150000;

    static {
        sieveOfEratosthenes();
    }

    private static void sieveOfEratosthenes() {
        boolean[] isPrime = new boolean[MAXIMUM_POSSIBLE_PRIME_NUMBER];
        Arrays.fill(isPrime, true);
        for(int number = 2; number*number< MAXIMUM_POSSIBLE_PRIME_NUMBER; number++){
            if(!isPrime[number])
                continue;
            for(int multipleOfTheNumber = number*number; multipleOfTheNumber< MAXIMUM_POSSIBLE_PRIME_NUMBER; multipleOfTheNumber+=number){
                isPrime[multipleOfTheNumber] = false;
            }
        }
        for(int number = 2; number < MAXIMUM_POSSIBLE_PRIME_NUMBER; number++){
            if (isPrime[number])
                primes.add(number);
        }

    }

    int findNthPrime(int nthIndex) {
        if(nthIndex<1)
            throw new IllegalArgumentException();
        return primes.get(nthIndex-1);
    }

}
