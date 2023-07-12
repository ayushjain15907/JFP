import javax.swing.*;
class MyJFrame extends JFrame
{
    JTextArea ta;
    JPanel p1,p2,p3;
    JTabbedPane tp;
    public static void main(String[]args)
    {
        MyJFrame obj=new MyJFrame();
    }
    public MyJFrame()
    {
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        tp=new JTabbedPane();
        setSize(500,500);
        setLocation(100,100);
        setVisible(true);
        setLayout(null);
        tp.setBounds(50,50,400,350);
        tp.add("main",p1);
        tp.add("view",p2);
        tp.add("help",p3);
        add(tp);

    }
}