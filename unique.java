import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.next();

        LinkedHashMap<Character,Integer> m1=new LinkedHashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            if(m1.containsKey(s1.charAt(i)))
            {
                m1.put(s1.charAt(i), m1.get(s1.charAt(i))+1);
            }
            else
                m1.put(s1.charAt(i) ,1);
        }
        int count=0;
        for(Map.Entry<Character,Integer> e1:m1.entrySet())
        {
            if(e1.getValue()==1)
                count++;
            if(count==5)
            {
                System.out.println(e1.getKey());
            }
        }
        System.out.println(m1);



    }
    
}
