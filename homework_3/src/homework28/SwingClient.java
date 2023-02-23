package homework28;

/**
 * Java. Homework №28.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 20.02.2023 - 23.02.2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class SwingClient extends JFrame {
    JTextArea dialogue;
    JTextField mgsField;
    JButton connect;
    JButton send;
    JPanel panel;

    PrintWriter writer;
    BufferedReader reader;

    public static void main(String[] args) {
        new SwingClient();
    }

    public SwingClient() {
        setTitle("Client for network chat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                if (writer !=null) {
                    writer.println("exit");
                    writer.close();
                }
            }
        });

        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        dialogue.setEditable(false);
        JScrollPane scroll = new JScrollPane(dialogue);

        mgsField = new JTextField();
        connect = new JButton("Connect");
        send = new JButton("Send");
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(connect);
        panel.add(mgsField);
        panel.add(send);

        connect.addActionListener(e -> connect());

        send.addActionListener(e -> {
            //System.out.println("Send!");
            try {
                writer.println(mgsField.getText());
            writer.flush();
            String echo=null;
                echo= reader.readLine();
            dialogue.append(echo + "\n");
            mgsField.setText(null);
            if (echo.equals("exit")) {
                connect.setEnabled(true);
            }
            } catch (SocketException ex) {
                System.out.println("Connection to server lost");
                connect.setEnabled(true);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });

        //mgsField.addActionListener();

        add(BorderLayout.CENTER, scroll);
        add(BorderLayout.SOUTH, panel);
        setVisible(true);

        connect();
    }

    private void connect() {
        try {
            Socket socket = new Socket("localhost", 2040);
            writer = new PrintWriter(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Connection to server...");
            connect.setEnabled(false);
        } catch (IOException e) {
            System.out.println("Can't connect to server");;
        }
    }
}
