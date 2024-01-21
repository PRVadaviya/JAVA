import java.util.* ;

class fog
{
     fog(String x1 , String x2)
     {
          System.out.println(x1 + "  "+ x2);
     }

     fog(float f1 , float f2)
     {
        System.out.println((f1+f2)/2);
     }
}


public class ConstructorOverloading2 {
    

     public static void main(String[] args) {
          
     
     Scanner read = new Scanner(System.in);

     String F_name  = read.next();
     String L_name  = read.next();

     float s1 = read.nextFloat();
     float s2 = read.nextFloat();

     fog c1 = new fog(F_name , L_name);

     fog c2 = new fog(s1 , s2);

     }

}

