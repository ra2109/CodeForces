import java.util.Scanner;

public class ringrod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }

        long ans=0;
        int currentpos=1;
        for(int i=0;i<m;i++)
        {
            if(arr[i]>=currentpos)
            {
                ans+=arr[i]-currentpos;
            }
            else
            {
                ans=ans+n-currentpos+arr[i];
            }
            currentpos=arr[i];
        }
        System.out.println(ans);
    }
    
}
