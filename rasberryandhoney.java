import java.util.Scanner;

public class rasberryandhoney {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int cost=sc.nextInt();

        int[] arr=new int[days];

        for(int i=0;i<days;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<days-1;i++)
        {
           max=Math.max(max,arr[i]-arr[i+1]); 
        }

        if(max<=0)
            System.out.println(0);
        else
            {   
                if(cost>max)    
                     System.out.println(0);
                else
                    System.out.println(max-cost);
            }
    }
    
}
