import java.awt.*;

class damo extends Frame
{

     damo()
     {
          setTitle("pratik");
          setVisible(true);
          setSize(700, 500);

          CardLayout c1 = new CardLayout();
          setLayout(c1);

          Panel p1 = new Panel();
          Panel p2 = new Panel();

          p1.add(new Button("submit"));
          p1.add(new Button("open"));

          p2.add(new Button("check"));
          p2.add(new Button("uncheck"));

          //add(p1,"card1");
          add(p2,"card2");

          c1.show(this , "card2");
          //c1.show(this , "card1");
     }
}


public class cardlayout {
     public static void main(String[] args) {
          
          damo d = new damo();
     }
}
