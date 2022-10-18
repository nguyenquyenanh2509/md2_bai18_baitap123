package ra;

public class OptimizedPrimeFactorization implements Runnable {

    private int n;

    public OptimizedPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int j = 2; j < n; j++) {
            int dem = 0;
            int sqrtJ = (int) Math.sqrt(j);
            for (int i = 1; i <= sqrtJ; i++) {
                if (j % i == 0) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println("day la tuat toan toi uu    "+j);

            }
        }
    }
}

