import java.awt.* ;

class demos extends Frame
{
     demos()
     {
          setTitle("pratik");
          setLayout(new BorderLayout());
          setVisible(true);
          setSize(1000, 1000);

          Button b1 = new Button("submit");
          Button b2 = new Button("open");
          Button b3 = new Button("close");
          Button b4 = new Button("unsubmit");
          Button b5 = new Button("center");

          add(b1 , BorderLayout.SOUTH);
          add(b2 , BorderLayout.EAST);
          add(b3 , BorderLayout.WEST);
          add(b4 , BorderLayout.NORTH);
          add(b5 , BorderLayout.CENTER);
     }
}


public class Boarder {

     public static void main(String[] args) {
          
          demos d = new demos();
     }
     
}
