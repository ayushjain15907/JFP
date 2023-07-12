/*import java.awt.*;
import java.awt.event.*;
public class Prac3 extends Frame implements ActionListener
{
    TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bclr,ba,bs,bm,bd,bp;
    Panel p1,p2,p3,p4,p5,p6;
    public static void main(String[]args)
    {
        Prac3 obj=new Prac3();
    }
    public Prac3()
    {
        setSize(600,600);
        setLocation(200,200);
        setVisible(true);
        setTitle("CALCULATOR");
        setLayout(new GridLayout(5,1));
        p1=new Panel();
        p2=new Panel();
        p3=new Panel();
        p4=new Panel();
        p5=new Panel();
        p1.setLayout(new BorderLayout(20,20));
        add("Center",p1);
        t1=new TextField();
        p1.add(t1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        p2.setLayout(new GridLayout(1,4,10,5));
        p3.setLayout(new GridLayout(1,4,10,5));
        p4.setLayout(new GridLayout(1,4,10,5));
        p5.setLayout(new GridLayout(1,4,10,5));
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        ba=new Button("+");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(ba);
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        bs=new Button("-");
        p3.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(bs);
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        bm=new Button("X");
        p4.add(b7);
        p4.add(b8);
        p4.add(b9);
        p4.add(bm);
        bp=new Button(".");
        b0=new Button("0");
        bclr=new Button("clr");
        bd=new Button("/");
        p5.add(bp);
        p5.add(b0);
        p5.add(bclr);
        p5.add(bd);      
    }
}*/