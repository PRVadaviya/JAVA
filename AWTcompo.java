import java.awt.*;
import java.awt.event.* ;

class awtr extends Frame
{
     awtr()
     {
          super("foam");

          setVisible(true);
          setLayout(new GridLayout(10,3,1,40));
          setSize(1000, 1000);

          Label nameLabel = new Label("Name:");
          TextField nameTextField = new TextField(20);

          add(nameLabel);
          add(nameTextField);

          Label emaillLabel = new Label("Email:");
          TextField emailTextField = new TextField(20);

          add(emaillLabel);
          add(emailTextField);

          Label genderLabel = new Label("Gender:");

          CheckboxGroup c1 = new CheckboxGroup();
          Checkbox male = new Checkbox("MALE", c1, true);
          Checkbox Female = new Checkbox("FEMALE", c1, false);

          Panel p1 = new Panel();
          p1.add(male);
          p1.add(Female);

          add(genderLabel);
          add(p1);

          Label address = new Label("Address:");
          TextArea addressText = new TextArea(5, 20);

          add(address);
          add(addressText);          
          
          Label Hobbie = new Label("Hobbies");
          Checkbox c2 = new Checkbox("write", false);
          Checkbox c3 = new Checkbox("read", false);

          Panel p2 = new Panel();
          p2.add(c2);
          p2.add(c3);

          add(Hobbie);
          add(p2);

          Label education = new Label("Education");
          List l1 = new List();

          l1.add("india");
          l1.add("usa");
          l1.add("uk");

          add(education);
          add(l1);

          Label s1 = new Label("Benefit");
          Scrollbar scr = new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
          
          add(s1);
          add(scr);


          Label s2 = new Label("Country");
          Choice countryChoice = new Choice();
          countryChoice.add("Select");
          countryChoice.add("india");
          countryChoice.add("Canada");
          countryChoice.add("UK");       

          add(s2);
          add(countryChoice);

          Label s3 = new Label("write");
          Canvas ca = new Canvas();
          ca.setBackground(Color.PINK);

          add(s3);
          add(ca);

          Label s4 = new Label();

          Button b1 = new Button("submit");
          Panel buttonPanel = new Panel(); // Panel to hold submit button
          buttonPanel.add(b1);
          
          add(s4);
          add(buttonPanel);

     }

}

public class AWTcompo {
     
     public static void main(String[] args) 
     {
          awtr a1 = new awtr();
          
     }
}