package Expt_8;

import java.awt.*;
import java.awt.event.*;

public class AWTFrameDemo extends Frame {
    Label label;
    TextField textField;
    Button button;

    public AWTFrameDemo() {
        setTitle("AWT Frame Demo");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);

        Font font = new Font("Arial", Font.BOLD, 16);
        label = new Label("Enter Your Name:");
        label.setFont(font);
        label.setForeground(Color.BLUE);

        textField = new TextField(20);
        textField.setFont(new Font("Courier", Font.PLAIN, 14));
        textField.setForeground(Color.DARK_GRAY);

        button = new Button("Submit");
        button.setFont(new Font("SansSerif", Font.ITALIC, 14));
        button.setBackground(Color.GREEN);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                label.setText("Hello, " + name + "!");
            }
        });

        add(label);
        add(textField);
        add(button);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTFrameDemo();
    }
}
