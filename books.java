import java.util.Scanner;
import java.util.Arrays;
public class books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long m=sc.nextLong();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // Arrays.sort(arr);

        int count=0;
        long sum=0;
        int left=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            while(sum>m)
            {
              sum=sum-arr[left];
              left++;  
            }
            count=Math.max(count, i-left+1);
        }
      

        System.out.println(count);
        

        

    }
    
}
