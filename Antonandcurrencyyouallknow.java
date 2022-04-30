import java.util.Scanner;

public class Antonandcurrencyyouallknow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        String s=sc.next();
        
        for(int i=0;i<s.length();i++)
        {
            
                if( s.charAt(i)%2==0 && s.charAt(i)<s.charAt(s.length()-1))
                {
                    char a=s.charAt(s.length()-1);
                    char b=s.charAt(i);
                    s=s.substring(0, i)+a+s.substring(i+1, s.length()-1)+b;
                    System.out.println(s);
                    return;        
                
                    
                }
            
        }
        
            for(int i=s.length()-2;i>=0;i--)
            {
               
                   if( s.charAt(i)%2==0)
                    {
                        char a=s.charAt(s.length()-1);
                        char b=s.charAt(i);
                        s=s.substring(0, i)+a+s.substring(i+1, s.length()-1)+b;
                        System.out.println(s);
                       
                        return;
                            

                    
                    }
                
            }
        
        
            System.out.println(-1);
      
        
    }
    
}
