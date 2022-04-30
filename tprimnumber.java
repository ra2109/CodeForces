
import java.io.*;
import java.util.Scanner;
public class tprimnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
       
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }

        for(int i=0;i<n;i++)
        {
            long a=(long)Math.sqrt(arr[i]);
            // System.out.println(a);
            if(isPrime(a) && a*a==arr[i])
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }


        }

      


        
    }
    public static boolean isPrime(long x)
    {
      
        if(x<2)
            return false;
        if(x==2)
            return true;
        if(x%2==0)
            return false;
        for(long i=3;i<=Math.sqrt(x);i=i+2)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }

    
}
