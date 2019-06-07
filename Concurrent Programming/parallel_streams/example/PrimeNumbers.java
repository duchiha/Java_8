

import java.util.stream.LongStream;

class PrimeNumbers {
    private static boolean isPrime(long val) {
        for(long i = 2; i <= val/2; i++) {
            if((val % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    // you can  convert the stream (sequential) to a parallel stream by calling parallel().
    public static void main(String []args) {
    	int a1=1;
    	int a2=10_000;
        long numOfPrimes = LongStream.
        		rangeClosed(a1, a2).
        		parallel()
                .filter(PrimeNumbers::isPrime)
                .count();
        System.out.println("Total of Prime Numbers "+ "between "+a1+" and " +a2+" is :"+numOfPrimes);
    }
}
