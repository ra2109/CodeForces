import java.util.Scanner;
import java.util.Arrays;
public class vanayaAndLalterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lalterns=sc.nextInt();
        long length=sc.nextLong();

        long[] arr=new long[lalterns];
        for(int i=0;i<lalterns;i++)
        {
            arr[i]=sc.nextLong();
        }

      Arrays.sort(arr);
      double ans=0;
       ans=Math.max(arr[0],ans);
        ans=Math.max(ans,length-arr[lalterns-1]);
        

   

      for(int i=0;i<arr.length-1;i++)
      {
             ans=Math.max(ans,(arr[i+1]-arr[i])/2.0);
            
          
            
      }
     
      System.out.println(ans);




    }
    
}
