package homework25;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * Java. Homework №25.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 09.02.2023 - 13.02.2023
 */

public class RaceDemo {

    public static final int CARS_COUNT = 4;

    public static final CountDownLatch START = new CountDownLatch(CARS_COUNT+1);
    public static final Semaphore TUNNEL = new Semaphore(CARS_COUNT/2, true);
    public static final CountDownLatch FINISH = new CountDownLatch(CARS_COUNT);

    public static void main(String[] args) throws InterruptedException {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(80), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i] = new Car(race, 20 + (int) (Math.random() * 10))).start();
        }

        while (START.getCount() > 1) { // Проверяем, собрались ли все автомобили
            Thread.sleep(100);          //у стартовой прямой. Если нет, ждем 100ms
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        START.countDown();              // даем старт всем машинам

        while (FINISH.getCount() > 0); // пока не финишировали все машины
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}
