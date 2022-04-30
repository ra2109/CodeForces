

import java.util.*;

public class Tprimenew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    
        Set<Long> al=new HashSet<>();
        int a[]=new int[1000000+1];
        al.add(4l);
        for(int i=3;i<1000000+1;i=i+2)
        {
            if(a[i]==0)
            {
                long m=Long.valueOf(i);
                al.add(m*m);
                for(int j=i*2;j<=1000000;j=j+i)
                {
                    a[j]=1;
                }
            }
        }
        // System.out.println(al);
        for(int i=0;i<n;i++)
        {
            if(al.contains(sc.nextLong()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        // if(al.contains(999983))
        // {
        //     System.out.println("ok");
        // }

     



    }

  
    
}
