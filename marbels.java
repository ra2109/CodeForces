import java.util.Scanner;

public class marbels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int count=0;
        while(start!=end && arr[start-1]!=0 )
        {
            int temp=arr[start-1];
            arr[start-1]=0;
            start=temp;

            count++;

        } 
        if(start==end)
            System.out.println(count);
        else
            System.out.println(-1);
        
    }
    
}
