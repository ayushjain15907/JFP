/*
import java.awt.*;
import java.awt.event.*;
public class Prac5 extends Frame implements ActionListener
{
    public TextField t1;
    public Button b1,b2;
    public Panel p1,p2,p3,p4,p5,p6;
    public Label l1,l2,l3;
    public static void main(String[]args)
    {
        Prac5 obj=new Prac5();
    }
    public Prac5()
    {
        setSize(400,400);
        setLocation(200,200);
        setLayout(new GridLayout(2,2));
        b1=new Button("Ok");
        b2=new Button("Submit");
        l1=new Label("default");
        t1=new TextField();
      add("North",b1);
        add("South",b2);
        add("West",l1);
        add("East",t1);  
        add(b1);
        add(b2);
        add(l1);
        add(t1);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }   
    }
}
*/