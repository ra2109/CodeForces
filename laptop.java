import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class laptop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        // int[] price=new int[n];
        // int[] quality=new int[n];
        ArrayList<lap> al=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            lap l1=new lap(a,b);
            al.add(l1);
            
        }
        Collections.sort(al, new Comparator<lap>(){
            public int compare(lap l1,lap l2)
            {
                return l1.getprice()-l2.getprice();
            }
            
        });

        for(int i=0;i<al.size()-1;i++)
        {
            if(al.get(i).getquality()>al.get(i+1).getquality() && al.get(i).getprice()<al.get(i+1).getprice())
            {
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");

    }
    
}
 class lap{
     int price;
     int quality;
    lap(int price,int quality)
    {
        this.price=price;
        this.quality=quality;
    }
    public int getprice()
    {
        return this.price;
    }
    public int getquality()
    {
        return this.quality;
    }
}
