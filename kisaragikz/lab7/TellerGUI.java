import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JButton bn1, bn2, bn3;
    private JPanel p1, p2, p3;
    private JTextField t1, t2;
    private JLabel l1, l2;
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        t1 = new JTextField();
        t2 = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        t1.setEnabled(true);
        t2.setEnabled(true);
        p1.add(l1);
        p1.add(t1);
        p1.setLayout(new GridLayout(1, 2));
        p2.add(l2);
        p2.add(t2);
        p2.setLayout(new GridLayout(1, 2));
        p3.add(bn1);
        p3.add(bn2);
        p3.add(bn3);
        p3.setLayout(new GridLayout(1, 3));
        fr.setLayout(new GridLayout(4, 1));
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.pack();
        fr.setVisible(true);
    }
    // public static void main(String[] args) {
    //     new TellerGUI();
    // }
}
