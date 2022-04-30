import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuffixStructures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();

        int suma=0;
        int sumb=0;
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                suma+=a.charAt(i)-'0';
                sumb+=b.charAt(i)-'0';
            }
            if(suma==sumb)
                System.out.println("array");
            else
                System.out.println("need tree");
        }
        else if(b.length()<a.length())
        {
            // if(a.contains(b))
            //     System.out.println("automation");
            int n=0;
            int k=0;
            for(int i=0;i<a.length();i++)
            {
                if(n<b.length())
               { if(a.charAt(i)==b.charAt(n))
                {
                    n++;
                }
            }
            }
            if(n==b.length())
                System.out.println("automaton");
            else
            {
            Map<Character,Integer> m1=new HashMap<>();
            Map<Character,Integer> m2=new HashMap<>();
            for(int i=0;i<a.length();i++)
            {
                if(!m1.containsKey(a.charAt(i)))
                {
                    m1.put(a.charAt(i), 1);

                }
                else
                {
                    m1.put(a.charAt(i), m1.get(a.charAt(i))+1);
                }
            }
            for(int i=0;i<b.length();i++)
            {
                if(!m2.containsKey(b.charAt(i)))
                {
                    m2.put(b.charAt(i), 1);

                }
                else
                {
                    m2.put(b.charAt(i), m2.get(b.charAt(i))+1);
                }
            }
            // System.out.println(m1);
            // System.out.println(m2);
            for(Map.Entry<Character,Integer> es:m2.entrySet())
            {
                if(m1.get(es.getKey())!=null)
            { 
                  if(!(m1.get(es.getKey())>=es.getValue()))
                {
                    System.out.println("need tree");
                    return;
                }
            }
            else
            {
                System.out.println("need tree");
                return;
            }
            }
            System.out.println("both");
        }
    }
    else
    {
        System.out.println("need tree"); 
    }
  
        
    }
    
}
