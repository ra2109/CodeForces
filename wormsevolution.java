import java.util.Scanner;
import java.util.Arrays;
 
public class wormsevolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        Arrays.sort(arr);
       

        int right=arr[n-2];
        int right_i=n-2;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]==n)
        //        { right=arr[i];
        //             right_i=i;
        //     }

        // }
        System.out.println(right+" "+right_i);
        
        for(int i=0;i<right_i;i++)
        {
            int l=i+1;
            // int right=n-1;
            while(l<right_i)
            {
                if(arr[i]+arr[l]==right)
                {
                    System.out.println(arr[right_i]+" "+arr[l]+" "+arr[i]);
                    return;
                }
                if(arr[i]+arr[l]<right)
                {
                    l++;
                }
            }
 
        }
        
        System.out.println(-1);
        
    }
   
    
}