public class methodoverloading {
     
     public static void main(String[] args) {
          
          int a=4 ,b=5,c=6;

          System.out.println("two argument --" + add(a,b));

          System.out.println("three argument --" + add(a,b,c));


     }

      static int add(int a,int b,int c)
     {
          return a+b+c ;
     }

      static int add(int a,int b)
     {
          return a+b ;
     }
}
