import java.util.Scanner;

public class lever {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        int equal=a.indexOf('^');

        long right=0;
        long left=0;
        for(int i=equal+1;i<a.length();i++)
        {
            if(a.charAt(i)-'0'>=0 && a.charAt(i)-'0'<=9) 
            {
                // System.out.println(a.charAt(i)-'0');
                right=right+((i-equal)*(a.charAt(i)-'0'));
            }
                
        }

        for(int i=equal-1;i>=0;i--)
        {
            if(a.charAt(i)-'0'>=0 && a.charAt(i)-'0'<=9) 
                {
                    // System.out.println(a.charAt(i)-'0');
                    left=left+((equal-i)*(a.charAt(i)-'0'));
                } 

        }
        // System.out.println(left);
        // System.out.println(right);
        if(left==right)
            System.out.println("balance");
        else if(left>right)
            System.out.println("left");
        else
        {
            System.out.println("right");
        }



    }
    
}
