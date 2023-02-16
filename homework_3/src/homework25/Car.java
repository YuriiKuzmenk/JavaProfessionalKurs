package homework25;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static homework25.RaceDemo.FINISH;
import static homework25.RaceDemo.START;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
       // CyclicBarrier START = new CyclicBarrier(4);
        try {
            System.out.println(name + " готовится (скорость: " + speed + ")");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(name + " готов");
            //START.await();

            START.countDown();  // ожидаем готовность
            START.await();      //всех машин

        } catch (InterruptedException e) {
                 //| BrokenBarrierException
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go (this);
        }

        if (FINISH.getCount() ==  CARS_COUNT) {     //определяем победителя
            System.out.println(name + " - WIN");    // гонки
        }

        try {
            FINISH.countDown();     // ожидание финиша
            FINISH.await();         // всех участников
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
