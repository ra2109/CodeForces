import java.util.Scanner;

public class Reconnaissance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();

        }
        int min=Integer.MAX_VALUE;
        int k=-1;
        int l=-1;
        for(int i=0;i<a-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])<min)
            {
                min=Math.abs(arr[i]-arr[i+1]);
                k=i+1;
                l=i+2;
            }
          
        }
        if(Math.abs(arr[0]-arr[a-1])<min)
        {
            min=Math.abs(arr[0]-arr[a-1]);
            k=0+1;
            l=a-1+1;
        }

        System.out.println(k+" "+l);
    }
    
}

