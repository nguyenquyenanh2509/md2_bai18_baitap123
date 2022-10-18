package ra;

public class LazyPrimeFactorization implements Runnable  {
    private int n;

    public LazyPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int j = 2; j < n; j++) {
            int dem = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.println("day la thuat toan ko toi uu   "+j);

            }
        }
    }
}