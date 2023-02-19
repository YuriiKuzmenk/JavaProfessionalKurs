package lesson27;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        new EchoClient();
    }

    public EchoClient(){
        try (Socket socket = new Socket("localhost", 2047);
            PrintWriter writer = new PrintWriter (socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Connection to server...");
            Scanner scanner = new Scanner(System.in);
            String message = null;
            do {
                System.out.print("# ");
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
                System.out.println();
            } while (!message.equals("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
