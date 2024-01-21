import java.util.* ;

public class experiment31 {
     
     public static void main(String[] args) 
     {
          
     Scanner read = new Scanner(System.in);

     System.out.println( "enter first array len" );
     int l1 = read.nextInt();

     System.out.println( "enter second array len" );
     int l2 = read.nextInt();
     
     int k = 0 , t=l1+l2 ;
     int[] arr1 = new int[l1];
     int[] arr2 = new int[l2];
     int[] ans = new int[t];
      

     System.out.println("enter a first array");
     for(int i=0 ; i<l1 ; i++)
     {
          arr1[i] = read.nextInt();
     }

     System.out.println("enter a second array");
     for(int i=0 ; i<l2 ; i++)
     {
          arr2[i] = read.nextInt();
     }

     int p=0,q=0;

     while(p<l1 && q<l2)
     {
          if(arr1[p] < arr2[q])
          {
               ans[k]=arr1[p] ;
               k++;
               p++;
          }
          else if(arr1[p] > arr2[q])
          {
               ans[k]=arr2[q];
               k++;
               q++;
          }
          else if(arr1[p] == arr2[q])
          {
               ans[k]=ans[p];
               k++;
               p++;
               q++;
          }
     }

     while(p<l1)
     {
          ans[k]=arr1[p] ;
          k++;
          p++;
     }

     while(q<l2)
     {
          ans[k]=arr2[q] ;
          k++;
          q++;
     }

     System.out.println("result");

     for (int z=0 ; z<k ; z++) 
     {
          System.out.println(ans[z] + "\t");
     }

}


     
}
