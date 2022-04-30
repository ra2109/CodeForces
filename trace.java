import java.util.Scanner;
import java.util.Arrays;
public class trace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        double pi=3.1415926536;
        double ans=0;
        Arrays.sort(arr);
      
        if(arr.length==1)
        {
            ans=3.1415926536*arr[0]*arr[0];
            System.out.println(ans);
            return;
        }
        // else
        // {
        //     ans=(3.1415926536*arr[0]*arr[0])+((3.1415926536*arr[n-1]*arr[n-1])-(3.1415926536*arr[n-2]*arr[n-2]));
        // }
        // System.out.println(ans);

        for(int i=n-1;i>0;i=i-2)
        {
            // System.out.println((arr[i]*arr[i])-(arr[i-1]*arr[i-1]));
            ans=ans+pi*((arr[i]*arr[i])-(arr[i-1]*arr[i-1]));
        }
        // ans=ans+3.1415926536*arr[0]*arr[0];

        if(n%2==0)
        {
            System.out.println(ans);
        }
        else
        {
            ans=ans+3.1415926536*arr[0]*arr[0];
            System.out.println(ans);
        }
       
    }
    
}
