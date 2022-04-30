import java.util.Scanner;

public class engunyandarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrsize=sc.nextInt();
        int queries=sc.nextInt();

        // int[] arr=new int[arrsize];
        
        int countp=0;
        int countn=0;
        for(int i=0;i<arrsize;i++)
        {
            if(sc.nextInt()==1)
            // if(arr[i]==1)
                 countp++;
            else
                countn++;
        }
        for(int i=0;i<queries;i++)
        {
            int left=sc.nextInt();
            int right=sc.nextInt();
            int range=right-left+1;

            if(range%2==0)
            {
                if(countn>=range/2 && countp>=range/2)
                    System.out.println(1);
                else
                    System.out.println(0);

            }
            else
                System.out.println(0);

        }
    }
    
}
