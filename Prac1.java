import java.awt.*;
public class Prac1 extends Frame
{
    public static void main(String[]args)
    {
        Prac1 obj=new Prac1();
    }
    public Prac1()
    {
        setLocation(300,300);
        setSize(700,700);
        setTitle("My frame");
        setVisible(true);
        Label l1=new Label("Registration Form");
        TextField t2=new TextField();
        TextField t3=new TextField();
        TextField t5=new TextField();
        Label l2=new Label("First name");
        Label l3=new Label("last name");
        Label l4=new Label("Select Gender");
        Label l5=new Label("Branch");
        Button b1=new Button("SUBMIT");
        Button b2=new Button("CANCEL");
        Checkbox c1=new Checkbox("Accept terms and condition");
        Choice ch1=new Choice();
        ch1.add("male");
        ch1.add("female");
        ch1.add("others");
        setLayout(null);
        l1.setBounds(300,50,200,30);
        l2.setBounds(100,100,150,30);
        t2.setBounds(300,100,150,30);
        l3.setBounds(100,200,150,30);
        t3.setBounds(300,200,150,30);
        l4.setBounds(100,260,150,30);
        ch1.setBounds(150,295,150,30);
        l5.setBounds(100,340,100,30);
        t5.setBounds(210,340,150,30);
        c1.setBounds(100,500,300,30);
        b1.setBounds(250,600,100,40);
        b2.setBounds(450,600,100,40);
        add(l1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(l5);
        add(t5);
        add(ch1);
        add(c1);
        add(b1);
        add(b2);
    }
}