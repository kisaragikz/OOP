import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JButton bn1, bn2, bn3;
    private JPanel p1, p2, p3;
    private JTextField t1, t2;
    private JLabel l1, l2;
    private Account ac;
    public TellerGUI(Account ac) {
        this.ac = ac;
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        t1 = new JTextField((int)ac.getBalance()+"");
        t1.setEditable(false);
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

        bn1.addActionListener(this);
        bn2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(bn2)){
            if(ac.getBalance() >= Integer.parseInt(t2.getText())){
                System.out.println(ac.getBalance());
                ac.setBalance(ac.getBalance()-Integer.parseInt(t2.getText()));
                t1.setText((int)ac.getBalance()+"");
            }
        }else if(ev.getSource().equals(bn1)){
            System.out.println(ac.getBalance());
            ac.setBalance(ac.getBalance()+Integer.parseInt(t2.getText()));
            t1.setText((int)ac.getBalance()+"");
        }
    }
    public static void main(String[] args) {
        Account a1 = new Account(6000, "64070164");
        new TellerGUI(a1);
    }
}
