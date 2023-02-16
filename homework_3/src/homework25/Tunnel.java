package homework25;

import static homework25.RaceDemo.TUNNEL;

public class Tunnel extends Stage {

    public Tunnel(int length) {
        this.length = length;
        this.description = "Тоннель " + length + "км";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу (ждет): " + description);

                TUNNEL.acquire();

                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep((length*1000) / c.getSpeed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
            }

            TUNNEL.release();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}