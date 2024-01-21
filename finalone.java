final class tive
{
     void amount()
     {
          System.out.println("1000");
     }

}

//cannot extends tive because it's final class 
//class give extends tive 

class give
{
     final void atmpin ()          //final method
     {
          System.out.println("1234");
     }


     void accountno()
     {
          System.out.println("466586526");
     }
}

class five extends give
{
     // error final method cannot override

     // void atmpin()
     // {
     //      System.out.println("1234");
     // }


     void ifsc ()
     {
          System.out.println("sbi");
     }



}


public class finalone {
     public static void main(String[] args) {

          final int A =10 ;             // final variable 
          System.out.println(A);
          //   A = 20 ; //error
          //   System.out.println(A); //error

          five obj = new five();
          obj.ifsc();
          obj.accountno();

          //this way to use final method
          give obj2 = new give();
          obj2.atmpin();


          // this way to use final class
          tive obj1 = new tive(); 
          obj1.amount();
     }
}
