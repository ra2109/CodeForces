import java.util.*;
import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    
        Set<Integer> al=new HashSet<>();
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        boolean[] bool=new boolean[1000000+1];
        Arrays.fill(bool,true);

        for(int i=2;i*i<=1000000;i++)
        {
            if(bool[i])
            {
                for(int j=i*i;j<=1000000;j=j+i)
                {
                    bool[j]=false;
                }
            }
        }
        for(int i=2;i<1000000+1;i++)
        {
            if(bool[i])
                al.add(i);
        }

        for(int i=0;i<n;i++)
        {
            double sqrt=Math.sqrt(arr[i]);

            int intsqrt=(int)sqrt;
            if((sqrt-intsqrt)==0)
            {
                if(al.contains(intsqrt))
                    System.out.println("YES");
                else
                {
                    System.out.println("NO");
                }
            }
            else
                System.out.println("NO");
        }

   }

  
    
}

    

