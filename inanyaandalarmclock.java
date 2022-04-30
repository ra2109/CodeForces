import java.util.*;
public class inanyaandalarmclock {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int[] x=new int[101];
        int [] y=new int[101];

        for(int i=0;i<n;i++)
        {
            x[sc.nextInt()]++;
            y[sc.nextInt()]++;
        }
        int a=0;
        int b=0;
        for(int i=0;i<=100;i++)
        {
            if(x[i]!=0)
            {
                a++;
            }
            if(y[i]!=0)
            {
                b++;
            }
        }
        if(a<b)
            System.out.println(a);
        else
            System.out.println(b);


    }
    
}
