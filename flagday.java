import java.util.*;
public class flagday {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
     
        // Map<Integer,Integer> s1=new HashMap<>();
       
        int arr[]=new int[1000001];
       
        for(int i=0; i<m;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=1;j<4;j++)
            {
                al.add(j);
            }
            // System.out.println(al);
            if(arr[a]!=0)
            {
                al.remove(Integer.valueOf(arr[a]));
               
            }
            else if(arr[b]!=0)
            {
                al.remove(Integer.valueOf(arr[b]));
                
            }
            else if(arr[c]!=0)
            {
                al.remove(Integer.valueOf(arr[c]));
                
            }
             if(arr[a]==0)
            {
              arr[a]=al.get(0);
            al.remove(0);
            //   System.out.println(al +"ok");
              
            }
             if(arr[b]==0)
            {
              arr[b]=al.get(0);
              al.remove(0);
            //   System.out.println(al);
            }
             if(arr[c]==0)
            {
              arr[c]=al.get(0);
              al.remove(0);
            
            }

        }

        for(int i=1;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
      
        
    }
    
}


class singelton
{
    private static singelton instance=null;
    
    public String s;
    private singelton()
    {
        String s="Hello";
    }
    public static singelton getInstance()
    {
        if(instance==null)
        {
            instance=new singelton();

        }
        return instance;
    }
}