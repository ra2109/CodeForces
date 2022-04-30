import java.util.Scanner;

public class leastrride {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cost=0;
        if(m*a<=b)
            System.out.println(n*a);
     
        else
        {
             cost=(n/m)*b+Math.min((n%m)*a,b);
             System.out.println(cost);
        }
       
    }
    
}
