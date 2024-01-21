import java.awt.*;
import java.awt.Graphics.* ;
import java.awt.event.* ;

class bhuvo extends Frame implements ActionListener
{
     
     int i=0,j=0,z=0,a=0,b=0 ;
     String s1 = "" ;

     bhuvo()
     {
        setSize(600,500);
	   setVisible(true);
	   setLayout(new FlowLayout());
	   Button b1=new Button("Rect");
	   add(b1);
        Button b2=new Button("circle");
	   add(b2);
	   Button b3=new Button("Red");
	   add(b3);
        Button b4=new Button("Blue");
	   add(b4);

	   b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
     }


     public void actionPerformed(ActionEvent a)
     {
          s1 = a.getActionCommand();
          i=1;
          repaint();
     }

     public void paint(Graphics g)
     {
          if(i == 1)
          {
               if(s1.equals("circle") )
               {
                    g.drawOval(250, 150, 100, 100);
                    j=1;
               }
               else if(s1.equals("Rect") )
               {
                    g.drawRect(250, 150, 100, 100);
                    z=1;
               }
               else if(s1.equals("Blue"))
               {
                    if(z == 1 )
                    {
                         g.setColor(Color.BLUE);
                         g.fillRect(250, 150, 100, 100);
                         a=1;
                         
                         if(a==1 && s1.equals("Red"))
                         {
                              g.setColor(Color.RED);
                              g.fillRect(250, 150, 100, 100);
                              a=0;
                              z=0;
                         }
                    }
                    else if( j == 1)
                    {
                         g.setColor(Color.BLUE);
                         g.fillOval(250, 150, 100, 100); 
                         b=1;

                         if(b==1 && s1.equals("Red"))
                         {
                              g.setColor(Color.RED);
                              g.fillOval(250, 150, 100, 100);
                              b=0;
                              j=0;
                         }
                    }
                   
               }
                else if(s1.equals("Red"))
               {
                    if(z == 1)
                    {
                         g.setColor(Color.RED);
                         g.fillRect(250, 150, 100, 100);
                         a=1;

                         if(a==1 && s1.equals("Blue"))
                         {
                              g.setColor(Color.BLUE);
                              g.fillRect(250, 150, 100, 100);
                              a=0;
                              z=0;
                         }
                    }
                    else if( j== 1)
                    {
                         g.setColor(Color.RED);
                         g.fillOval(250, 150, 100, 100); 
                         b=1;

                         if(b==1 && s1.equals("Blue"))
                         {
                              g.setColor(Color.BLUE);
                              g.fillOval(250, 150, 100, 100);
                              b=0;
                              j=0;
                         }
                    }
               }
               
          }
     }
}


public class actionevent2 {
     public static void main(String[] args) 
     {
          bhuvo bh = new bhuvo();
          
     }
}

