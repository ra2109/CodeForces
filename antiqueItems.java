import java.util.ArrayList;
import java.util.Scanner;

public class antiqueItems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long total_items=sc.nextLong();
        long total_money=sc.nextLong();
        int count=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<total_items;i++)
        {
            int a=sc.nextInt();
            boolean flag=false;
            for(int j=0;j<a;j++)
            {
                long b=sc.nextLong();
                if(flag==false)
                {
                    if(b<total_money)
                    { 
                        count++;
                        flag=true;
                        al.add(i+1);
                        // break;
                    }
            }
            }
        }
        System.out.println(count);
        for(Integer a:al)
        {
            System.out.print(a+" ");
        }
        
    }
    
}
