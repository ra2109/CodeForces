import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class lectures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        Map<String,String> m1=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            m1.put(sc.next(),sc.next());
        }
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            // String s1=arr[i];
            String s1=m1.get(arr[i]);
            if(s1.length()>=arr[i].length())
            {
                System.out.print(arr[i]+" ");
            }
            // else if(s1.length()==arr[i].length())
            // {
            //     System.out.print(s1+" ");
            // }
            else
            {
                System.out.print(s1+" ");
            }
        }

    }

    
}
