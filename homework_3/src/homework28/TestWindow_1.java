package homework28;

import javax.swing.*;
import java.awt.*;

public class TestWindow_1 extends JFrame {

    public static void main(String[] args) {
        new TestWindow_1();
    }

    public TestWindow_1() {
        setTitle("CHAT GPT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);

        JTextArea chatHistory = new JTextArea("History");

        JTextField message = new JTextField();
        JButton send = new JButton("SEND");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(message);
        panel.add(send);

        add(BorderLayout.CENTER, chatHistory);
        add(BorderLayout.SOUTH, panel);

        setVisible(true);
    }
}
