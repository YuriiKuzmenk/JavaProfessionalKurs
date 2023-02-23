package homework28;

import javax.swing.*;

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



        setVisible(true);
    }
}
