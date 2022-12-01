package lesson8;

public class lesson8 {
    public static void main(String[] args) {
        RubberList <Integer> rl = new RubberList<>();
        System.out.println(rl);
        rl.add(12);
        rl.add(4);
        rl.add(8);
        rl.add(3);
        System.out.println(rl);
        rl.remove(4);
        rl.remove(8);
        rl.remove(8);
        System.out.println(rl);
    }
}
