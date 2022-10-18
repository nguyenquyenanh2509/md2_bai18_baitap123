import ra.NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator(1);
        NumberGenerator bg2 =new NumberGenerator(2);
        ng.start();
        bg2.start();
    }
}