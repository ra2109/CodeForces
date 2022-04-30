import java.util.Scanner;

public class LuckyDivison {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        String b=Integer.toString(a);
        boolean flag=true;
        for(int i=0;i<b.length();i++)
        {
            if(!(b.charAt(i)=='4' || b.charAt(i)=='7'))
                flag=false;
        }
        if(flag)
            System.out.println("YES");

        if(flag==false)
        if(a%4==0 || a%7==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    
}
