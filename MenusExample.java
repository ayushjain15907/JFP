import java.awt.*;
public class MenusExample extends Frame
{
    MenuBar mb;
    Menu m1,m2;
    MenuItem mi1,mi2,mi3,mi4;
    public static void main(String[]args)
    {
        MenusExample obj=new MenusExample();
    }
    public MenusExample()
    {
        setSize(500,500);
        setLocation(100,100);
        setVisible(true);
        mb=new MenuBar();
        m1=new Menu("File");
        m2=new Menu("Edit");
        mi1=new MenuItem("new");
        mi2=new MenuItem("open");
        mi3=new MenuItem("copy");
        mi4=new MenuItem("cut");
        m1.add(mi1);
        m1.add(mi2);
        m2.add(mi3);
        m2.add(mi4);
        mb.add(m1);
        mb.add(m2);
        setMenuBar(mb);


    }    
}
