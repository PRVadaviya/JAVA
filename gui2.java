import java.awt.* ;
import java.awt.Graphics.*;

class mydemo extends Frame
{

     mydemo()
     {    
          super("pratik vadaviya");
         // Button b1 = new Button("submit") ;
          setSize(400,400);
         // setBackground(Color.RED);
          setVisible(true); 
         // add(b1);   
     }

     public void print(Graphics g)
     {
          g.drawString("hello", 50, 50);
     }

     public static void main(String[] args) {
          
          mydemo m1 = new mydemo();
          m1.print(null);
     }

}



// class gui2
// {
//      public static void main(String[] args) 
//      {
//           mydemo m1 = new mydemo();
//           Graphics NULL;
//           print(NULL);
//      }
// } 


