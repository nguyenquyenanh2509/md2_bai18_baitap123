package ra;

public class NumberGenerator extends Thread{
    private int i;
    public NumberGenerator(int i){
        this.i=i;
    }
    public void run(){
        System.out.println(this.i+this.hashCode());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
}
