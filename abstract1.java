abstract class A 
{
    // abstract int sum1(int a,int b);
     abstract double area (double a , double b);
}

class B extends A
{
     // int sum1 (int a , int b)
     // {
     //      return(a+b);
     // }

     double area (double a, double b)
     {
          return(a*b);
     }

}


public class abstract1 {
     
     public static void main(String[] args) {
          
          B obj = new B();
         // int r = obj.sum1(2,3);
          double w = obj.area(3.14, 2.23);
          //System.out.println("sum of this" + r);
          System.out.println("area of this"+ w);
     }
}
