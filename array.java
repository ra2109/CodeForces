
import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];
        ArrayList<Integer> n=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> z=new ArrayList<>();

        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
               n.add(arr[i]);
            if(arr[i]>0)
               p.add(arr[i]);
            if(arr[i]==0)
                z.add(arr[i]);


        }
        // System.out.println(n);
        // System.out.println(p);
        // System.out.println(z);

        if(p.size()==0)
        {
           p.add(n.remove(0));
           p.add(n.remove(1));
        }
        if(n.size()%2==0)
        {
            z.add(n.remove(0));
        }
       
        System.out.print(n.size()+" ");
        for(int i:n) 
        {
            System.out.print(i+" ");
            
        } 
        System.out.println(); 
        System.out.print(p.size()+" ");
        for(int i:p) 
        {
            System.out.print(i+" ");
           
        } 
        System.out.println();
        System.out.print(z.size()+" ");
        for(int i:z) 
        {
            System.out.print(i+" ");
        }        
 
        


       

    }
    
}

