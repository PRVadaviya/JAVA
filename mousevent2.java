import java.awt.* ;
import java.awt.Graphics.* ;
import java.awt.event.* ;


class movi extends Frame implements MouseListener , MouseMotionListener 
{
     boolean b = false ;
     int i=0;

     movi()
     {
          super("mouse event");
          addMouseListener(this);
          addMouseMotionListener(this);
          setVisible(true);          
          setSize(500, 600);
     }

     public void paint(Graphics g)
     {
          if(b == true)
          {
               g.drawString("HELLO", 250, 300);
               b=false ;
          }

          if(i == 1)
          {
               //g.setColor(Color.RED);
               g.fillRect(112,120,100,100);
               i=0;
          }
     }

     public void mouseClicked(MouseEvent e)
     {
          //setBackground(Color.GREEN);
          b = true ;
          repaint(); 
     }

     public void mouseReleased(MouseEvent e)
     {

     }

     public void mousePressed(MouseEvent e)
     {
         
     }

     public void mouseEntered(MouseEvent e)
     {
          
     }

     public void mouseExited(MouseEvent e)
     {
          i = 1 ;
          repaint();
     }

     public void mouseMove(MouseEvent e)
     {
          
     } 

     public void mouseDragged(MouseEvent e)
     {

     }
}

public class mousevent2 
{
     public static void main(String[] args) 
     {
          movi m2 = new movi();
     }
}
