package TestPackage;

import org.junit.Assert;
import org.junit.Test;

public class PrimesTest {

    @Test
    public void primeNumberReturnsTrueIfValueIsPrime() {
        boolean out = Primes.isPrime(7);
        Assert.assertTrue(out);
    }

    @Test
    public void primeNumberReturnsFalsIfValueIsNotPrime() {
        boolean out = Primes.isPrime(6);
        Assert.assertFalse(out);
    }

    @Test
    public void oneIsNotAPrime() {
        boolean out = Primes.isPrime (1);
        Assert.assertFalse(out);
    }

    @Test
    public void negativeNumbersAreNotPrimes() {
        boolean out = Primes.isPrime(-7);
        Assert.assertFalse(out);
    }


//    public static void main(String[] args) {
//
//        boolean out = Primes.isPrime(7);
//        if(out != true) {
//            System.out.println("FOUT");
//        } else  {
//            System.out.println("OK");
//        }
//
//
//        out = Primes.isPrime(10);
//        if(out != false) {
//            System.out.println("FOUT");
//        } else  {
//            System.out.println("OK");
//        }
//
//
//
//    }

}
