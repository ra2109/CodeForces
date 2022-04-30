import java.util.ArrayList;
import java.util.Scanner;



public class VasyaandWrestling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        
        ArrayList<Long> a=new ArrayList<>();
        ArrayList<Long> b=new ArrayList<>();

        int size=0;
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
            if(arr[i]>0)
                a.add(arr[i]);
            else
                b.add(Math.abs(arr[i]));
        }
        long sum1=0;
        long sum2=0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                sum1+=arr[i];
                
            else
                sum2+=Math.abs(arr[i]);
        }
        if(sum1>sum2)
            // System.out.println("first");
            flag=true;
        else if(sum1<sum2)
            // System.out.println("second");
            flag=false;
        else
        {
            if(a.size()>b.size())
                size=b.size();
            else
               { size=b.size();}
               
            for(int j=0;j<size;j=j+1)
            {
                if(a.get(j)>b.get(j))
                    {
                        flag=true;
                        break;
                    }
                else if(a.get(j)<b.get(j))
                   { 
                       flag=false;
                        break;
                    }
                else
                {
                   if(arr[n-1]>0)
                   {
                       flag=true;
                   }
                   else
                        flag=false;

                }
            }

                
        }
        
        if(flag)
            System.out.println("first");
        else
            System.out.println("second");

        
    }
    
}
