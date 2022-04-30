import java.util.ArrayList;
import java.util.Scanner;

public class StrangeAddition {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int total_count=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(count==0 && arr[i]%10!=0)
            {
               al.add(arr[i]);
               count++;

            }
            if(arr[i]%10==0)
            {
               
                {al.add(arr[i]);}
            }
         
                
          
        }
        System.out.println(al.size());
        for(int i=0;i<al.size();i++)
        {
            if(i!=al.size()-1)
            {
                    System.out.print(al.get(i)+" ");
                

            }
            else
                System.out.print(al.get(i));
        }


    }
    
}
