package lesson27;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        new EchoServer();
    }

    public EchoServer() {
        try (ServerSocket server = new ServerSocket(2048)) {
            System.out.println("Server started...");
            while (true) {
                Socket socket = server.accept();
                System.out.println("Client connected...");
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = null;
                do {
                    message = reader.readLine();
                    System.out.println("Client say: " + message);
                } while (!message.equals("exit"));
                reader.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
