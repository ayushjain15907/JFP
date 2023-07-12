/*/*import java.awt.*;
public class MyFrame extends Frame
{
    public static void main(String[]args)
    {
        MyFrame obj=new MyFrame();
    }
    public MyFrame()
    {
        setSize(300,300);
        setLocation(10,10);
        setTitle("My first frame");
        setLayout(new FlowLayout());
        setVisible(true);
    }    
}
*/
/* 
import java.awt.*;
public class MyFrame
{
    private Frame f;
    public static void main(String[]args)
    {
        MyFrame obj=new MyFrame();
        obj.launchFrame();
    }
    public MyFrame()
    {
        f=new Frame("My First Frame");
    }
    public void launchFrame()
    {
        f.setSize(300,300);
        f.setLocation(10,10);
        f.setBackground(Color.blue);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}*/