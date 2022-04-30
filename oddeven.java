import java.util.Scanner;

public class oddeven {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  a=sc.nextLong();
        long b=sc.nextLong();
        long odd=0;
        // int even=0;
        if(a%2==0)
            odd=a/2;
        else
            odd=(a/2)+1;

        if(b<=odd)
        {
            System.out.println(1+(b-1)*2);
        }
        else
        {
            System.out.println(2+(b-odd-1)*2);
        }
        
    }

}
