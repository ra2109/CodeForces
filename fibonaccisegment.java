
import java.util.Scanner;
public class fibonaccisegment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      
        int max=2;
        // int count=2;
        int ans=0;
        if(n<2)
            System.out.println(1);
        else if(n==2)
            System.out.println(2);
        else
        {
            int i=0;
            while(i<=n-3)
            {
                if(arr[i]+arr[i+1]==arr[i+2])
                {
                    i++;
                    max++; ///x max
                }
                else
                {
                    ans=Math.max(ans,max);
                    max=2;
                    i++;
                }
            }
            ans=Math.max(ans,max);
            System.out.println(ans);
        }
      


    }
    
}
