package lesson9;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        long COUNT = 300_000;

        // using String
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < COUNT; i++) {
            str += "x";
        }
        System.out.println("String: " + (System.currentTimeMillis() - startTime) + "  COUNT = " + COUNT);

        byte k=0;
        while (k<3) {
            k++;
            // using StringBuffer
            startTime = System.currentTimeMillis();
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < COUNT; i++) {
                buffer.append("x");
            }
            System.out.println("StringBuffer: " + (System.currentTimeMillis() - startTime) + "  COUNT = " + COUNT);

            // using StringBuilder
            startTime = System.currentTimeMillis();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < COUNT; i++) {
                builder.append("x");
            }
            System.out.println("StringBuilder: " + (System.currentTimeMillis() - startTime) + "  COUNT = " + COUNT);
        COUNT=COUNT*30;
        }

    }
}