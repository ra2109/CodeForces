import java.util.Scanner;

public class roadsidetree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=n-1+n+arr[0];
        for(int i=0;i<n-1;i++)
        {
            ans=ans+Math.abs(arr[i]-arr[i+1]);
        }
        System.out.println(ans);
    }
    
}
