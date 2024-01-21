import java.awt.* ;
import java.awt.Graphics.* ;
import java.awt.event.* ;


class move extends Frame implements MouseListener , MouseMotionListener 
{
     move()
     {
          super("mouse event");
          addMouseListener(this);
          addMouseMotionListener(this);
          setVisible(true);          
          setSize(500, 600);
     }

     public void mouseClicked(MouseEvent e)
     {
          setBackground(Color.GREEN);
     }
     
     public void mouseReleased(MouseEvent e)
     {
          setBackground(Color.PINK);

     }

     public void mousePressed(MouseEvent e)
     {
          setBackground(Color.GRAY);
     }

     public void mouseEntered(MouseEvent e)
     {
          setBackground(Color.RED);
     }

     public void mouseExited(MouseEvent e)
     {
          setBackground(Color.BLUE);
     }

     public void mouseMove(MouseEvent e)
     {
          setBackground(Color.YELLOW);
     } 

     public void mouseDragged(MouseEvent e)
     {
          setBackground(Color.BLACK);
     }
}

public class mousevent 
{
     public static void main(String[] args) 
     {
          move m1 = new move();
     }
}
