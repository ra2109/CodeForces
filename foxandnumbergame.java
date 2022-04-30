
import java.util.Arrays;
import java.util.Scanner;

public class foxandnumbergame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        int max=0;
        // int k=0;
        // int i=1;
        Arrays.sort(arr);
        for( int i=1;i<=arr[arr.length-1];i++)
        {
            int k=0;
            while(k<=n-1)
            {
                if(arr[k]%i==0)
                {
                    k++;
                    continue;
                }
                    
                else
                    break;
                    
              
            }

            if(k==n)
            {
                max=Math.max(i,max);
                x=i;
                // System.out.println(max);
            }

        }
        // System.out.println(x);
        System.out.println(n*x);
    }
    
}
