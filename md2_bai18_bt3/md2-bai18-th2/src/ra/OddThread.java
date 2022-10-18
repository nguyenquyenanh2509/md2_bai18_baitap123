package ra;

public class OddThread extends Thread{
    public void run(){
        for (int i = 1; i < 10; i++) {
            if (i%2==1){
                System.out.println(i);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
