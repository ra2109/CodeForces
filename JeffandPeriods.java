import java.util.*;

public class JeffandPeriods {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,ArrayList<Integer>> m1=new HashMap<>();
        Map<Integer,Integer> ans=new TreeMap<>();
        // Set<Pair> ans=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(m1.containsKey(a))
            {
                ArrayList<Integer> al=m1.get(a);
                al.add(i);
            }
            else
            {
                ArrayList<Integer> al=new ArrayList<>(); 
                al.add(i);
                m1.put(a,al);
            }
        }

        for(Map.Entry<Integer,ArrayList<Integer>> es:m1.entrySet())
        {
            if(es.getValue().size()==1)
            {

                ans.put(es.getKey(),0);
            }
            else if(es.getValue().size()==2)
            {
                ArrayList<Integer> al=es.getValue();
                ans.put(es.getKey(),al.get(1)-al.get(0));
                // Pair p1=new Pair();
                // ans.add(new Pair(es.getValue(),al.get(1)-al.get(0)));
            }
            else
            {
                ArrayList<Integer> al=es.getValue();
                int cd=al.get(1)-al.get(0);
                boolean flag=true;
                for(int i=2;i<al.size();i++)
                {
                    if(al.get(i)-al.get(i-1)!=cd)
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag==true)
                {
                    ans.put(es.getKey(),cd);
                }
            }
          
        }
        // Collections.sort(ans);
        System.out.println(ans.size());
        for(Map.Entry<Integer,Integer> m2:ans.entrySet())
        {
            System.out.println(m2.getKey()+" "+m2.getValue());
        }

    
    }
    
}
