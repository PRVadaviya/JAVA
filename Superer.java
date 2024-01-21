class A
{
     int a=40;
     
     public A()
     {
          System.out.println("defualt A");
     }

     public A(int i)
     {
          System.out.println("int  A" + i);
     }    


}

class B extends A
{
     int a=30 ;
     
     public B()
     {    
          super();
          System.out.println(super.a);
          System.out.println("defualt B");
     }

     public B(int i)
     {
          super(i);
          System.out.println("int  B" + i);
     }    

}

public class Superer {

     public static void main(String[] args) {
          
          B obj = new B();
         // System.out.println(obj.a);
     }
     
}
