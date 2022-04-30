import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count1=0;
        int count2=0;
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        String a=arr[0];
        String b="";
        for(int i=0;i<n;i++)
        {
            if(arr[i].equals(a))
            {
                count1++;
            }
            else{
                count2++;
                 b=arr[i];

                }
               
        }
        if(count1>count2)
            System.out.println(a);
        else
            System.out.println(b);
       
    }
    
}
