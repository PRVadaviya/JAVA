import java.awt.*;
import java.awt.Graphics.* ;
import java.awt.event.* ;

class bhuvi extends Frame implements ActionListener
{
     Button b1;
     boolean b = false ;
     bhuvi()
     {
          setSize(600,500);
	   setVisible(true);
	   setLayout(new FlowLayout());
	   Button b1=new Button("Click");
	   add(b1);
	   b1.addActionListener(this);
     }


     public void actionPerformed(ActionEvent a)
     {
          b = true;
          repaint();

     }

	public void paint(Graphics g)
	{
	    if(b)
		{
               g.setColor(Color.BLUE);
               g.drawRect(150,150,100,100); 
               b=false;
		}
	}
}


public class actioevent {
     public static void main(String[] args) {
          
          bhuvi b = new bhuvi();
     }
}
