package homework27;

/**
 * Java. Homework №27.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 16.02.2023 - 20.02.2023
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        new HelloServer();
    }

    public HelloServer() {
        try (ServerSocket server = new ServerSocket(2047)) {
            System.out.println("Server started...");
            while (true) {
                Socket socket = server.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println("Server says: Hello!");
                System.out.println("Message sent to client");
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
