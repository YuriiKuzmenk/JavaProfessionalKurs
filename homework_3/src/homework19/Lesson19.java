package homework19;

/**
 * Java. Homework №19.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 19.01.2023 - 23.01.2023
 */

import java.io.*;

public class Lesson19 {
    public static void main(String[] args) {
        File file = new File ("text.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.length());
        byteArrayStreamDemo();
        fileOutputStreamDemo();
        fileInputStreamDemo();
        fileWriteDemo();
        fileReadDemo();
    }

    static void byteArrayStreamDemo() {
        byte[] buffer = {66, 67, 68};
        ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
        int x;
        while ((x = bais.read()) != -1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void fileOutputStreamDemo() {
        byte[] buffer = {0x30, 0x31, 0x32};
        try (FileOutputStream fos = new FileOutputStream("byte_file.bin")) {
            fos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void fileInputStreamDemo() {
        byte[] buffer = new byte[3];
        try (FileInputStream fis = new FileInputStream("byte_file.bin")) {
            fis.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (byte b : buffer) {
            System.out.println(b + " - " + (char) b);
        }
    }

    static void fileWriteDemo() {
        try (FileWriter fw = new FileWriter("char_file.txt")) {
            fw.write("Hello dudes!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void fileReadDemo() {
        char[] buffer = new char [12];
        try (FileReader fw = new FileReader("char_file.txt")) {
            fw.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(buffer));
    }

}
