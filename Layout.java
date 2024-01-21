import java.awt.*;

class demo extends Frame
{
     Button b1 = new Button("submit");
     Button b2 = new Button("open");
     Button b3 = new Button("close");

     demo()
     {
          setTitle("pratik");
          setLayout(new FlowLayout(7,50,50));
          setVisible(true);
          setSize(700, 500);

          add(b1);
          add(b2);
          add(b3);
     }
}

public class Layout
{
     public static void main(String[] args) 
     {
          demo d1 = new demo();
     }
}
