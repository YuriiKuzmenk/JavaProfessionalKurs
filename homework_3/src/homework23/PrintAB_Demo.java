package homework23;

public class PrintAB_Demo {
    public static void main(String[] args) {
        PrintAB pab = new PrintAB();
        new Thread(()-> pab.printA()).start();
        new Thread(()-> pab.printB()).start();
    }
}
