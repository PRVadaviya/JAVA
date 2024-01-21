import java.awt.*;

class demo extends Frame
{
     Button b1 = new Button("submit");
     Button b2 = new Button("open");
     Button b3 = new Button("close");

     demo()
     {
          setSize(700, 500);
          setVisible(true);
          setTitle("pratik");
          setLayout(new GridLayout(4,1));
          
          

          add(b1);
          add(b2);
          add(b3);
     }
}

public class gridlayout {
     public static void main(String[] args) 
     {

          demo d1 = new demo();

     }
}
