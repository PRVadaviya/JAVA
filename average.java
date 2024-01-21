import java.util.* ;

public class average {

     public static int check (int a,int b)
     {
          if((a+b)%2==0)
          {
               return ((a+b)/2) ;
          }
          else
          {
               return -1 ;
          }
     }

     public static void main(String[] args) {
          
          Scanner read = new Scanner(System.in);

          System.out.print("enter a two number");
          int a = read.nextInt();
          int b = read.nextInt();
          int c = check(a,b);   // also valid average.check(a,b);
          System.out.println(c);

     }
     
}
