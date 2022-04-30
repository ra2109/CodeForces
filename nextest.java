
import java.util.Scanner;
import java.util.Arrays;
public class nextest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

       Arrays.sort(arr);

      
        int j=2;
        if(arr[0]>1)
            {
                ans=1;
               
            }
        else
        {
            for(int i=1;i<n;i++)
            {
               
                if(arr[i]!=j)
                    {
                        ans=j;
                         break;
                     }
                j++;
            }
        }
      
        if(ans<=0)
        {
            ans=arr[arr.length-1]+1;
           
        }
        System.out.println(ans);

    }
    
}
