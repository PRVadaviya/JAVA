import java.awt.*;
import java.awt.Graphics.*; 
class mydemo extends Frame {

    mydemo() {
        super("pratik vadaviya");
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass paint method
        g.drawString("hello", 50, 50);
    }

    public static void main(String[] args) {
        mydemo m1 = new mydemo();
    }
}
