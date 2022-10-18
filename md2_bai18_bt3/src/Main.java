import ra.LazyPrimeFactorization;
import ra.OptimizedPrimeFactorization;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization la = new LazyPrimeFactorization(20);
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization(20);
        Thread th1 = new Thread(la);
        Thread th2 = new Thread(op);
        th1.start();
        th2.start();
    }
}