import java.util.*;
public class nineteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        Map<Character,Integer> m1=new HashMap<>();
        for(int i=0;i<s.length();i++)

        {
            if(!m1.containsKey(s.charAt(i)))
            {
                m1.put(s.charAt(i),1);
            }  
            else
            {
                m1.put(s.charAt(i),m1.get(s.charAt(i))+1);
            }  
        }
        // System.out.println(m1);
        int count=0;
        int min=0;
        if(m1.containsKey('i'))
        {
            min=m1.get('i');
        }
        else
           { System.out.println(min);
            return;}
        // System.out.println(min+"st");
        // int count=0;
       for(Map.Entry<Character,Integer> es:m1.entrySet())
       {
          
            if(es.getKey()=='n')
                {count++;
                min=Math.min(min,(es.getValue()-1)/2);}
            if(es.getKey()=='t')
               { count++;
                min=Math.min(min,(es.getValue()));}
            if(es.getKey()=='e')
                {count++;
                min=Math.min(min,(es.getValue()/3));}
       }
       if(count>=3)
            System.out.println(min);
        else
            System.out.println(0);

    // int[] count=new int[256];
    // for(int i=0;i<s.length();i++)
    // {
    //     count[s.charAt(i)]++;
    // }

    // int min=count['i'];

    // min=Math.min(min, (count['n']-1)/2);
    // // min=Math.min(min, (count['i']));
    // min=Math.min(min, (count['t']));
    // min=Math.min(min, (count['e'])/3);


    // System.out.println(min);

    }
   
    
}
