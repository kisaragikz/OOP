import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15;
    private JPanel p1, p2;
    private JTextField t;
    private int temp = 0;
    private String check = "";
    public CalculatorSample() {
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bn0 = new JButton("0");
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bn10 = new JButton("+");
        bn11 = new JButton("-");
        bn12 = new JButton("X");
        bn13 = new JButton("/");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        t = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();
        t.setEnabled(false);
        p1.setLayout(new GridLayout(1, 1));
        p1.add(t);
        p2.setLayout(new GridLayout(4, 4));
        p2.add(bn7); p2.add(bn8); p2.add(bn9); p2.add(bn10);
        p2.add(bn4); p2.add(bn5); p2.add(bn6); p2.add(bn11);
        p2.add(bn1); p2.add(bn2); p2.add(bn3); p2.add(bn12);
        p2.add(bn0); p2.add(bn14); p2.add(bn15); p2.add(bn13);
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.setSize(400, 350);
        fr.setVisible(true);

        bn1.addActionListener(this); bn2.addActionListener(this); bn3.addActionListener(this);
        bn4.addActionListener(this); bn5.addActionListener(this); bn6.addActionListener(this);
        bn7.addActionListener(this); bn8.addActionListener(this); bn9.addActionListener(this);
        bn0.addActionListener(this); bn10.addActionListener(this); bn11.addActionListener(this);
        bn12.addActionListener(this); bn13.addActionListener(this); bn14.addActionListener(this);
        bn15.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(bn0)){
            t.setText(t.getText()+"0");
        }
        else if(ev.getSource().equals(bn1)){
            t.setText(t.getText()+"1");
        }
        else if(ev.getSource().equals(bn2)){
            t.setText(t.getText()+"2");
        }
        else if(ev.getSource().equals(bn3)){
            t.setText(t.getText()+"3");
        }
        else if(ev.getSource().equals(bn4)){
            t.setText(t.getText()+"4");
        }
        else if(ev.getSource().equals(bn5)){
            t.setText(t.getText()+"5");
        }
        else if(ev.getSource().equals(bn6)){
            t.setText(t.getText()+"6");
        }
        else if(ev.getSource().equals(bn7)){
            t.setText(t.getText()+"7");
        }
        else if(ev.getSource().equals(bn8)){
            t.setText(t.getText()+"8");
        }
        else if(ev.getSource().equals(bn9)){
            t.setText(t.getText()+"9");
        }
        else if(ev.getSource().equals(bn10)){
            temp = Integer.parseInt(t.getText());
            check = "+";
            t.setText("");
        }
        else if(ev.getSource().equals(bn11)){
            temp = Integer.parseInt(t.getText());
            check = "-";
            t.setText("");
        }
        else if(ev.getSource().equals(bn12)){
            temp = Integer.parseInt(t.getText());
            check = "X";
            t.setText("");
        }
        else if(ev.getSource().equals(bn13)){
            temp = Integer.parseInt(t.getText());
            check = "/";
            t.setText("");
        }
        else if(ev.getSource().equals(bn14)){
            temp = 0;
            t.setText("");
        }
        else if(ev.getSource().equals(bn15)){
            if(check.equals("+")){
                temp += Integer.parseInt(this.t.getText());
            }
            else if(check.equals("-")){
                temp -= Integer.parseInt(this.t.getText());
            }
            else if(check.equals("X")){
                temp *= Integer.parseInt(this.t.getText());
            }
            else if(check.equals("/")){
                temp /= Integer.parseInt(this.t.getText());
            }
            t.setText(temp+"");
        }
        System.out.println(temp);
    }
    // public static void main(String args[]) {
    //     new CalculatorSample();
    // }
}
