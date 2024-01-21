import java.awt.* ;
import java.awt.Graphics.*;

class demu extends Frame
{
     demu()
     {
          setTitle("pratik");
          setVisible(true);
          setSize(700, 800);

          setLayout(null);
          Button b1 = new Button("submit");
          b1.setBounds(100, 100, 70, 30);
          add(b1);

          Button b2 = new Button("open");
          b2.setBounds(170, 100, 70, 30);
          add(b2);           

          Button b3 = new Button("close");
          b3.setBounds(100, 130, 70, 30);
          add(b3); 

          Button b4 = new Button("unsubmit");
          b4.setBounds(170, 130, 70, 30);
          add(b4);


     }
}


public class setbound {
     public static void main(String[] args) {
          demu d = new demu();
     }
     
}
