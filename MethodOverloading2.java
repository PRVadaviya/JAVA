class Method
{

     static int add(int a,int b,int c)
     {
          return a+b+c ;
     }

     static  int add(int a,int b)
     {
          return a+b ;
     }

}

public class MethodOverloading2 {

     public static void main(String[] args) {
          
          int a=2,b=5,c=8 ;

          System.out.println("add a and b --" + Method.add(a,b));

          System.out.println("add a and b and c --" + Method.add(a,b,c));

     }
     
}
