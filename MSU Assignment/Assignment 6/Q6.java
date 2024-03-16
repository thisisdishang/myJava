// Implement the following component using swing.
// JButton, JLabel, JTextField, JTextArea, JCheckBox, JList, JOptionPane, JDialogs, JMenuItem, JMenu.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // JLabel
        JLabel label = new JLabel("Enter your name:");
        frame.add(label);

        // JTextField
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // JButton
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // JTextArea
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Enable Feature");
        frame.add(checkBox);

        // JList
        String[] listData = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
        JList<String> list = new JList<>(listData);
        JScrollPane listScrollPane = new JScrollPane(list);
        frame.add(listScrollPane);

        // JMenuItem and JMenu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        fileMenu.add(menuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // JButton Action Listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                textArea.append("Hello, " + name + "!\n");
            }
        });

        // JOptionPane
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
