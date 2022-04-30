import java.util.Scanner;
import java.util.Arrays;
public class PetyaandStaircases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int m=sc.nextInt();
        if(m==0)
        {
            System.out.println("YES");
            return;
        }
        int[] arr=new int[m];

        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        boolean flag=true;
      
        if(m<=2)
        {
            if(arr[0] ==1|| arr[m-1]==n)
            {
                flag=false;
            }

        }
        else
        {
        for(int i=0;i<m-2;i=i+1)
        {
            // System.out.println(arr[0]+" "+arr[m-1]);
            if(arr[0]==1 || arr[m-1]==n)
            {
                flag=false;
            }
            // System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
            if(arr[i]+1==arr[i+1] && arr[i+1]+1==arr[i+2])
               {  
                  flag=false;
            
                }

        }
    }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    

}

