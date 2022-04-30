import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class yarsolavanadpermu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Map<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(!m1.containsKey(a))
            {
                m1.put(a, 1);
            }
            else
            {
                     
                int count=m1.get(a);
                     m1.put(a,count+1);
            }
            
            
            
                    
                
        }
        // System.out.println(m1);
        for(Map.Entry<Integer,Integer> e: m1.entrySet())
        {
            if(e.getValue()>(n+1)/2)
                
                {
                    System.out.println("NO");
                    return;
                }
            
                
        }
        System.out.println("YES");


    }
    
}
