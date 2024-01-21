
import java.util.*;

class fun
{
     public int add(int n1,int n2)
     {
          int result = n1 + n2 ;
          return result ;
     }
}

public class twoclass {
     
     public static void main(String[] args) {
          
          Scanner input = new Scanner(System.in);

          int x = input.nextInt();
          int y = input.nextInt();

          fun process = new fun();

          int f = process.add(x, y);

          System.out.println(f);

     }

}
