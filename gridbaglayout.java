import java.awt.*;

class de extends Frame
{
     Button b1 = new Button("submit");
     Button b2 = new Button("open");
     Button b3 = new Button("close");

     de()
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



public class gridbaglayout {

     de ge = new de();
     
}
