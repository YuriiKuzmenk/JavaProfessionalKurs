package homework4;

public class Cat {
    final int catrunlimit=100;
    final int catjumplimit=5;

    void run(int distance) {
        System.out.println("Cat can run "+ catrunlimit);
    };
    void jump(int hight){
        System.out.println("Cat can jump "+ catjumplimit);
    };
}
