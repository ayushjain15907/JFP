import java.awt.*;
import java.awt.event.*;

class MyCal extends Frame implements ActionListener,MouseListener,KeyListener,WindowListener
{
    char keyp,keyt,keyr;
    Double add;
    Double sub;
    Double mul;
    Double div;
    int temp;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,beq,badd,bsub,bmul,bdiv,bclr;
    TextField t1;
    Panel p1,p2,p3,p4,p5,p6;
    public static void main(String[]args)
    {
        MyCal obj=new MyCal();
    }
    public MyCal()
    {
        setSize(450,500);
        setLocation(200,200);
        setTitle("CALCULATOR");
        setVisible(true);
        setLayout(new GridLayout(2,1));
        p1=new Panel();
        p2=new Panel();
        add(p1);
        add(p2);
        t1=new TextField("",17);
        t1.setFont(new Font("Aerial",Font.BOLD,40));
        p1.add(t1);
        b0=new Button("0");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        bdot=new Button(".");
        bclr=new Button("CLEAR");
        beq=new Button("=");
        badd=new Button("+");
        bsub=new Button("-");
        bmul=new Button("X");
        bdiv=new Button("/");
        b0.setBackground(Color.black);
        b1.setBackground(Color.black);
        b2.setBackground(Color.black);
        b3.setBackground(Color.black);
        b4.setBackground(Color.black);
        b5.setBackground(Color.black);
        b6.setBackground(Color.black);
        b7.setBackground(Color.black);
        b8.setBackground(Color.black);
        b9.setBackground(Color.black);
        bdot.setBackground(Color.black);
        bclr.setBackground(Color.black);
        badd.setBackground(Color.black);
        bsub.setBackground(Color.black);
        bmul.setBackground(Color.black);
        bdiv.setBackground(Color.black);
        beq.setBackground(Color.black);
        b0.setForeground(Color.white);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        bdot.setForeground(Color.white);
        bclr.setForeground(Color.white);
        badd.setForeground(Color.white);
        bsub.setForeground(Color.white);
        bmul.setForeground(Color.white);
        bdiv.setForeground(Color.white);
        beq.setForeground(Color.white);
        p2.setLayout(new GridLayout(1,2));
        p3=new Panel();
        p4=new Panel();
        p2.add(p3);
        p2.add(p4);
        p3.setLayout(new GridLayout(4,4));
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(bdot);
        p3.add(b0);
        p3.add(bclr);
        p4.setLayout(new GridLayout(5,1));
        p4.add(badd);
        p4.add(bsub);
        p4.add(bmul);
        p4.add(bdiv);
        p4.add(beq);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bdot.addActionListener(this);
        bclr.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        beq.addActionListener(this);
        b0.addMouseListener(this);
        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
        b5.addMouseListener(this);
        b6.addMouseListener(this);
        b7.addMouseListener(this);
        b8.addMouseListener(this);
        b9.addMouseListener(this);
        bdot.addMouseListener(this);
        bclr.addMouseListener(this);
        badd.addMouseListener(this);
        bsub.addMouseListener(this);
        bmul.addMouseListener(this);
        bdiv.addMouseListener(this);
        beq.addMouseListener(this);
        b0.addKeyListener(this);
        b1.addKeyListener(this);
        b2.addKeyListener(this);
        b3.addKeyListener(this);
        b4.addKeyListener(this);
        b5.addKeyListener(this);
        b6.addKeyListener(this);
        b7.addKeyListener(this);
        b8.addKeyListener(this);
        b9.addKeyListener(this);
        bdot.addKeyListener(this);
        bclr.addKeyListener(this);
        badd.addKeyListener(this);
        bsub.addKeyListener(this);
        bmul.addKeyListener(this);
        bdiv.addKeyListener(this);
        beq.addKeyListener(this);
        addWindowListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        
        Button bt=(Button)e.getSource();
        String strtf=t1.getText();
        String strl=bt.getLabel();
        if(bt==b0)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b1)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b2)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b3)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b4)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b5)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b6)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b7)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b8)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==b9)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==bdot)
        {
            t1.setText(strtf+strl);
        }
        else if(bt==badd)
        {
            add=Double.parseDouble(t1.getText());
            temp=1;
            t1.setText("");
        }
        else if(bt==bsub)
        {
            sub=Double.parseDouble(t1.getText());
            temp=2;
            t1.setText("");
        }
        else if(bt==bmul)
        {
            mul=Double.parseDouble(t1.getText());
            temp=3;
            t1.setText("");
        }
        else if(bt==bdiv)
        {
            div=Double.parseDouble(t1.getText());
            temp=4;
            t1.setText("");
        }
        else if(bt==bclr)
        {
            temp=0;
            t1.setText("");
        }
        else
        {
            if(temp==1)
            {
                add=add+Double.parseDouble(t1.getText());
                t1.setText(Double.toString(add));
                temp=0;
            }
            else if(temp==2)
            {
                sub-=Double.parseDouble(t1.getText());
                t1.setText(Double.toString(sub));
                temp=0;
            }
            else if(temp==3)
            {
                mul=mul*Double.parseDouble(t1.getText());
                t1.setText(Double.toString(mul));
                temp=0;
            }
            else if(temp==4)
            {
                div=div/Double.parseDouble(t1.getText());
                t1.setText(Double.toString(div));
                temp=0;
            }
            else 
            {
                t1.setText("Insert operation");
            }

        }
    }
    public void mouseEntered(MouseEvent e)
    {
        Button bt1=(Button)e.getSource();
        bt1.setBackground(Color.white);
        bt1.setForeground(Color.black);
    }
    public void mousePressed(MouseEvent e)
    {
        Button bt1=(Button)e.getSource();
        bt1.setBackground(Color.darkGray);
        bt1.setForeground(Color.black);
    }
    public void mouseReleased(MouseEvent e)
    {
        Button bt1=(Button)e.getSource();
        bt1.setBackground(Color.gray);
        bt1.setForeground(Color.black);
    }
    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {
        Button bt1=(Button)e.getSource();
        bt1.setBackground(Color.black);
        bt1.setForeground(Color.white);
    }
    
    
    public void keyPressed(KeyEvent e)
    {
        keyp=e.getKeyChar();
        if(keyp=='1'){
            b1.setForeground(Color.black);
            b1.setBackground(Color.white);
        }
        else if(keyp=='2')
        {
            b2.setForeground(Color.black);
            b2.setBackground(Color.white);
        }
        else if(keyp=='3')
        {
            b3.setForeground(Color.black);
            b3.setBackground(Color.white);

        }
        else if(keyp=='4')
        {
            b4.setForeground(Color.black);
            b4.setBackground(Color.white);
        }
        else if(keyp=='5')
        {
            b5.setForeground(Color.black);
            b5.setBackground(Color.white);
        }
        else if(keyp=='6')
        {
            b6.setForeground(Color.black);
            b6.setBackground(Color.white);
        }
        else if(keyp=='7')
        {
            b7.setForeground(Color.black);
            b7.setBackground(Color.white);
        }
        else if(keyp=='8')
        {
            b8.setForeground(Color.black);
            b8.setBackground(Color.white);
        }
        else if(keyp=='9')
        {
            b9.setForeground(Color.black);
            b9.setBackground(Color.white);
        }
        else if(keyp=='0')
        {
            b0.setForeground(Color.black);
            b0.setBackground(Color.white);

        }
        else if(keyp=='.')
        {
            bdot.setForeground(Color.black);
            bdot.setBackground(Color.white);
        }
        else if(keyp=='+')
        {
            badd.setForeground(Color.black);
            badd.setBackground(Color.white);
        }
        else if(keyp=='-')
        {
            bsub.setForeground(Color.black);
            bsub.setBackground(Color.white);
        }
        else if(keyp=='*')
        {
            bmul.setForeground(Color.black);
            bmul.setBackground(Color.white);
        }
        else if(keyp=='/')
        {
            bdiv.setForeground(Color.black);
            bdiv.setBackground(Color.white);
        }
        else if(keyp=='c'|| keyp=='C')
        {
            bclr.setForeground(Color.black);
            bclr.setBackground(Color.white);
        }
        else if(keyp=='=')
        {
            beq.setForeground(Color.black);
            beq.setBackground(Color.white);
        }
        else
        {
    
        }
    }
    public void keyReleased(KeyEvent e)
    {
        keyr=e.getKeyChar();
        if(keyr=='1')
        {
            b1.setForeground(Color.white);
            b1.setBackground(Color.black);
        }
        else if(keyr=='2')
        {
            b2.setForeground(Color.white);
            b2.setBackground(Color.black);
        }
        else if(keyr=='3')
        {
            b3.setForeground(Color.white);
            b3.setBackground(Color.black);

        }
        else if(keyr=='4')
        {
            b4.setForeground(Color.white);
            b4.setBackground(Color.black);
        }
        else if(keyr=='5')
        {
            b5.setForeground(Color.white);
            b5.setBackground(Color.black);
        }
        else if(keyr=='6')
        {
            b6.setForeground(Color.white);
            b6.setBackground(Color.black);
        }
        else if(keyr=='7')
        {
            b7.setForeground(Color.white);
            b7.setBackground(Color.black);
        }
        else if(keyr=='8')
        {
            b8.setForeground(Color.white);
            b8.setBackground(Color.black);
        }
        else if(keyr=='9')
        {
            b9.setForeground(Color.white);
            b9.setBackground(Color.black);
        }
        else if(keyr=='0')
        {
            b0.setForeground(Color.white);
            b0.setBackground(Color.black);

        }
        else if(keyr=='.')
        {
            bdot.setForeground(Color.white);
            bdot.setBackground(Color.black);
        }
        else if(keyr=='+')
        {
            badd.setForeground(Color.white);
            badd.setBackground(Color.black);
        }
        else if(keyr=='-')
        {
            bsub.setForeground(Color.white);
            bsub.setBackground(Color.black);
        }
        else if(keyr=='*')
        {
            bmul.setForeground(Color.white);
            bmul.setBackground(Color.black);
        }
        else if(keyr=='/')
        {
            bdiv.setForeground(Color.white);
            bdiv.setBackground(Color.black);
        }
        else if(keyr=='c'|| keyp=='C')
        {
            bclr.setForeground(Color.white);
            bclr.setBackground(Color.black);
        }
        else if(keyr=='=')
        {
            beq.setForeground(Color.white);
            beq.setBackground(Color.black);
        }
        else
        {

        }
    }
    public void keyTyped(KeyEvent e)
    {
        String strc=t1.getText();
        keyt=e.getKeyChar();
        if(keyt=='0')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt=='1')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt=='2')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt=='3')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt =='4')
        {
            t1.setText(strc+keyt );
        }
        else if(keyt=='5')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt=='6')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt =='7')
        {
            t1.setText(strc+keyt );
        }
        else if(keyt=='8')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt=='9')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt=='.')
        {
            t1.setText(strc+keyt);
        }
        else if(keyt=='+')
        {
            add=Double.parseDouble(t1.getText());
            temp=1;
            t1.setText("");
        }
        else if(keyt=='-')
        {
            sub=Double.parseDouble(t1.getText());
            temp=2;
            t1.setText("");
        }
        else if(keyt=='*')
        {
            mul=Double.parseDouble(t1.getText());
            temp=3;
            t1.setText("");
        }
        else if(keyt=='/')
        {
            div=Double.parseDouble(t1.getText());
            temp=4;
            t1.setText("");
        }
        else if(keyt=='c' || keyt=='C')
        {
            temp=0;
            t1.setText("");
        }
        else if(keyt=='=')
        {
            if(temp==1)
            {
                add=add+Double.parseDouble(t1.getText());
                t1.setText(Double.toString(add));
                temp=0;
                
            }
            else if(temp==2)
            {
                sub-=Double.parseDouble(t1.getText());
                t1.setText(Double.toString(sub));
                temp=0;
            }
            else if(temp==3)
            {
                mul=mul*Double.parseDouble(t1.getText());
                t1.setText(Double.toString(mul));
                temp=0;
            }
            else if(temp==4)
            {
                div=div/Double.parseDouble(t1.getText());
                t1.setText(Double.toString(div));
                temp=0;
            }
            else 
            {
                t1.setText("Insert operation");
            }
        }

    }
    public void windowActivated(WindowEvent e) {}    
    public void windowClosed(WindowEvent e) {}    
    public void windowClosing(WindowEvent e) 
    {   
    dispose();    
    }    
    public void windowDeactivated(WindowEvent e) {}    
    public void windowDeiconified(WindowEvent e) {}    
    public void windowIconified(WindowEvent e) {}    
    public void windowOpened(WindowEvent arg0) {}    
}    
