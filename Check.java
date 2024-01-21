public class Check {
     
     static int a ;
     static String s1;

     static
     {
          a  = 10 ;
          s1 = "pratik" ;
          a++;
     }
     

     public static void main(String[] args) {
          a++;
          System.out.println(a);
          System.out.println(s1);
          a++;
          System.out.println(a);
         
     }


}
