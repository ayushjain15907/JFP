import javax.swing.*;
import java.awt.event.*;
public class MyJFrame1 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton b1;
    JTextField t1,t2;
    public static void main(String[]args)
    {
        MyJFrame1 obj=new MyJFrame1();
    }
    public MyJFrame1()
    {
        setSize(320,400);
        setLocation(100,100);
        setVisible(true);
        setTitle("My JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l3=new JLabel("First no.");
        l2=new JLabel("Second no.");
        l1=new JLabel("Addition of two numbers numbers");
        l4=new JLabel();
        b1=new JButton("ADD");
        t1=new JTextField();
        t2=new JTextField();
        setLayout(null);
        l1.setBounds(20,20,260,30);
        l2.setBounds(20,70,100,30);
        t1.setBounds(130,70,50,30);
        l3.setBounds(20,110,100,30);
        t2.setBounds(130,110,50,30);
        b1.setBounds(90,160,80,30);
        l4.setBounds(100,200,260,30);
        add(l1);
        add(l2); 
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a,b,c;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        c=a+b;
        l4.setText(Integer.toString(c));
    }
}