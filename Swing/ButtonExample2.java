import javax.swing.*;

public class ButtonExample2 {
    ButtonExample2() {
        JFrame f = new JFrame("Button Example");
        // JButton b=new JButton(new ImageIcon("D:\\icon.png"));
        JButton b = new JButton(new ImageIcon("D:\\Images\\IMG-20220901-WA0014.jpg"));
        b.setBounds(500, 100, 500, 500);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample2();
    }
}