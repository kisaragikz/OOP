import java.awt.*;
import javax.swing.*;
public class SimpleCalGUI {
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4;
    private JPanel p, p1, p2;
    private JTextField t1, t2, t3;
    public SimpleCalGUI(){
        fr = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        bn1 = new JButton("Plus");
        bn2 = new JButton("Minus");
        bn3 = new JButton("Multipy");
        bn4 = new JButton("Divide");
        p.setLayout(new FlowLayout());
        p.add(p1);
        p.add(bn1);
        p.add(bn2);
        p.add(bn3);
        p.add(bn4);
        p.add(p2);
        fr.add(t1);
        fr.add(t2);
        fr.add(p);
        fr.add(t3);
        fr.setLayout(new GridLayout(4,1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleCalGUI();
        }       
}
