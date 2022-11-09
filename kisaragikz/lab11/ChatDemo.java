/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab11;

/**
 *
 * @author kisaragi
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel buttonPanel, textPanel;
    private JTextArea ta;
    private JButton bSubmit, bReset;
    private JTextField tf;
    String chat = "";
    public ChatDemo(){
        fr = new JFrame("");
        ta = new JTextArea(20, 45);
        ta.setEnabled(false);
        bSubmit = new JButton("Submit");
        bReset = new JButton("Reset");
        tf = new JTextField(45);
        buttonPanel = new JPanel();
        textPanel = new JPanel();
        try(FileReader fileReader = new FileReader("ChatDemo.dat")){
            int ch;
            while ((ch=fileReader.read())!=-1){
                chat += (char)ch;
            }
            ta.setText(chat);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        textPanel.setLayout(new BorderLayout());
        textPanel.add(ta, BorderLayout.NORTH);
        textPanel.add(tf, BorderLayout.SOUTH);
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(bSubmit);
        buttonPanel.add(bReset);
        fr.setLayout(new BorderLayout());
        fr.add(textPanel, BorderLayout.NORTH);
        fr.add(buttonPanel, BorderLayout.SOUTH);
        
        bSubmit.addActionListener(this);
        bReset.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - fr.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - fr.getHeight()) / 2);
        fr.setLocation(x, y);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(bSubmit)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText()+dtf.format(LocalDateTime.now())+" : "+tf.getText()+"\n");
            tf.setText("");
        }
        else if(ev.getSource().equals(bReset)){
            ta.setText("");
            tf.setText("");
        }
    }
    public void windowOpened(WindowEvent ev){}
    public void windowClosed(WindowEvent ev){}
    public void windowClosing(WindowEvent ev){
        try(FileWriter fileWriter = new FileWriter("ChatDemo.dat")){
            fileWriter.write(ta.getText());
        }catch(IOException e){
            System.out.print(e);
        }
    }
    public void windowIconified(WindowEvent ev){}
    public void windowDeiconified(WindowEvent ev){}
    public void windowActivated(WindowEvent ev){}
    public void windowDeactivated(WindowEvent ev){}
    public static void main(String[] args) {
        new ChatDemo();
    }
}
