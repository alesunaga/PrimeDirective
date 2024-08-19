// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Looking for a prime
  public boolean isPrime(int number) {
    if(number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }

    for(int i = 2; i <= Math.sqrt(number); i++) {
      if(number % i == 0) {
        return false;
      }
    }
    return true;
  }

// looking for primes in a Array
public ArrayList<Integer> onlyPrimes(int[] numbers) {
  ArrayList<Integer> primes = new ArrayList<>();
  
  for(int number:numbers) {
    if(isPrime(number)) {
      primes.add(number);
    }
  }
  return primes;
}
  
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89, 99, 37, 1237};
    System.out.println(pd.onlyPrimes(numbers));

  }  
}
