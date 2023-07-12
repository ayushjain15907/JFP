/*import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class Prac4 extends Frame implements ActionListener
{
    int counter=0;
    int temp=0;
    double add,sub,mul,div;
    TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bclr,ba,bs,bm,bd,bp,beq;
    Panel p1,p2,p3,p4,p5,p6;
    public static void main(String[]args)
    {
        Prac4 obj=new Prac4();
    }
    public Prac4()
    {
        setSize(350,350);
        setLocation(500,500);
        setVisible(true); 
        setTitle("Calculator");
        setLayout(new BorderLayout());
        p1=new Panel();
        p2=new Panel();
        add("North",p1);
        add("Center",p2);
        t1=new TextField("",40);
        p1.add(t1);
        p2.setLayout(new GridLayout(5,4,5,5));
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        ba=new Button("+");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        bs=new Button("-");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        bm=new Button("X");
        bp=new Button(".");
        b0=new Button("0");
        bclr=new Button("clr");
        bd=new Button("/");
        beq=new Button("=");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(ba);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bs);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bm);
        p2.add(bp);
        p2.add(b0);
        p2.add(bclr);
        p2.add(bd);
        p2.add(beq);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        ba.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bs.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bm.addActionListener(this);
        bp.addActionListener(this);
        b0.addActionListener(this);
        bclr.addActionListener(this);
        bd.addActionListener(this);
        beq.addActionListener(this);
        
    }
    public void equal()
    {

    }
    public void actionPerformed(ActionEvent e)
    {
        Button bt=(Button)e.getSource();
        String str=bt.getLabel();
        String str1=t1.getText();
        if(bt==b1)
        {
            t1.setText(str1+str);
        }
        else if(bt==b2)
        {
            t1.setText(str1+str);
        }
        else if(bt==b3)
        {
            t1.setText(str1+str);
        }
        else if(bt==b4)
        {
            t1.setText(str1+str);
        }
        else if(bt==b5)
        {
            t1.setText(str1+str);
        }
        else if(bt==b6)
        {
            t1.setText(str1+str);
        }
        else if(bt==b7)
        {
            t1.setText(str1+str);
        }
        else if(bt==b8)
        {
            t1.setText(str1+str);
        }
        else if(bt==b9)
        {
            t1.setText(str1+str);
        }
        else if(bt==b0)
        {
        t1.setText(str1+str);
        }
        else if(bt==bd)
        {
            t1.setText(str1+str);
        }
        else if(bt==bp)
        {
            t1.setText(str1+str);
        }
        else if(bt==ba)
        {
            add=add+Double.parseDouble(t1.getText());
        }

    }
}


*/