import java.util.Scanner;

public class LittlePonyandSortbyShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        int pos=0;
        boolean flag=true;
        boolean ans=true;
        for(int i=0;i<n-1;i++)
        {
            if(flag==true)
            { 
                if(arr[i+1]<arr[i])
                {
                    flag=false;
                    pos=i;
                }
            }

                else
                {
                    if(arr[i]>arr[i+1])
                        ans=false;
                }
                
        }
        if(flag)
       { 
           if(arr[0]==arr[n-1])
            {
                flag=false;
                pos=n-1;
            }
           
        }
        if(arr[0]<arr[n-1])
            {
                ans=false;
                pos=n-1;
            }

        // System.out.println(flag);
        // System.out.println(ans);
        if(flag==true && ans==false)
            System.out.println(n-pos-1);
        else if(flag==false && ans==true)

                { System.out.println(n-pos-1);}

        else
            System.out.println(-1);


    
}
}