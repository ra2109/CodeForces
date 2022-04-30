import java.util.Scanner;

public class comapringstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int count=0;
        int a1=0;
        int b1=0;
        if(a.length()!=b.length())
            {
                System.out.println("NO");
            }
       
        else
        {

            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)!=b.charAt(i))
                    count++;
                // a1=a1+a.charAt(i)-'0';
            }
            if(count>2)
            {
                System.out.println("NO");
                return;
            } 
            else
            {
                for(int i=0;i<a.length();i++)
                {
                    a1=a1+a.charAt(i)-'0';
                }
                for(int i=0;i<b.length();i++)
                {
                    b1=b1+b.charAt(i)-'0';
                }
                if(a1==b1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
    
}
//string a=abcd
//string b=acef; 
