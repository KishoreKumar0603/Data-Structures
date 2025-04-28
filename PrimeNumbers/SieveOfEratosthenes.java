package PrimeNumbers;

public class SieveOfEratosthenes {
    // Optimizations 
    // 1. j = i *2
    // 2. j = i * i
    // 3. i <= n ^ 0.5

    public static void main(String[] args) {
        int n = 31;
        boolean[] isPrime = new boolean[n + 1];

        for(int i = 2; i <= n; i++)
        {
            for(int j = i * i; j <= n; j += i)
            {
                isPrime[j] = true;
            }
        }

        for(int i = 2; i <= n; i++)
        {
            if(isPrime[i] == false)
            {
                System.out.print(i + " ");
            }
        }
    }
}