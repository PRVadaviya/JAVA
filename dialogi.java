import java.awt.*;    
import java.awt.event.*;  

class dialogi extends Frame
{ Dialog md;
  TextField t1,t2;
  Button b1;
  dialogi()
  {
	  setSize(700,400);
	  setVisible(true);
	  t1 = new TextField();
	  t2 = new TextField();
	  b1 = new Button("Submit");
	  md = new Dialog(this,"Login Dialog",false);
      md.setSize(200,200);
	  md.setVisible(true);
	  md.setResizable(true);
	  md.setLayout(new FlowLayout());
	  md.add(t1);
	  md.add(t2);
	  md.add(b1);
  }

public static void main(String args[])
{
 dialogi d = new dialogi();
}
}