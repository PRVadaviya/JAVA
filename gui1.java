import java.awt.*;
import java.awt.Graphics.*; 


public class gui1 
{
     public static void main(String[] args)
     {     
          Frame f1 = new Frame("pratik vadaviya");

          f1.setSize(500,400);
          f1.setBackground(Color.BLUE);
          f1.setVisible(true);
     }

     public void print(Graphics g)
     {
          g.drawString("hello", 50, 50);
     }
}
