package lesson24;

public class Printer {

    public synchronized void print (Document document) {
        long id = Thread.currentThread().getId();
        String name = document.getName();
        for (int p = 0; p <= document.getCountPage(); p++) {
            System.out.println(String.format("#%d Doc: %s page: %d printed", id, name, p));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(String.format("Doc: %s page: %d printed", name, p));
        }
    }
}
