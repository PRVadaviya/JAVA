import java.util.*;


public class ConstructorOverloading {
    
     ConstructorOverloading(String a , String b)
     {
          System.out.println(a + "  "+ b);
     }

     ConstructorOverloading(float a , float b)
     {
          System.out.println((a+b)/2);
     }


     public static void main(String[] args) {
          
     
     Scanner read = new Scanner(System.in);

     String F_name  = read.next();
     String L_name  = read.next();

     float s1 = read.nextFloat();
     float s2 = read.nextFloat();

     ConstructorOverloading c1 = new ConstructorOverloading(F_name , L_name);

     ConstructorOverloading c2 = new ConstructorOverloading(s1 , s2);

     }

}
