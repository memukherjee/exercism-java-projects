import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PrimeCalculator {
    static List<Integer> primes = new ArrayList<>();
    static int MAX_SIZE = 150000;

    static {
        sieveOfEratosthenes();
    }

    private static void sieveOfEratosthenes() {
        boolean[] isPrime = new boolean[MAX_SIZE];
        Arrays.fill(isPrime, true);
        for(int i=2;i*i<MAX_SIZE;i++){
            if(!isPrime[i])
                continue;
            for(int j=i*i; j<MAX_SIZE; j+=i){
                isPrime[j] = false;
            }
        }
        for(int i=2; i<MAX_SIZE; i++){
            if (isPrime[i])
                primes.add(i);
        }

    }

    int nth(int nth) {
        if(nth<1)
            throw new IllegalArgumentException();
        return primes.get(nth-1);
    }

}
