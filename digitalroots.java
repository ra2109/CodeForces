import java.util.Scanner;

public class digitalroots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        int d=sc.nextInt();

        if(d==0 && k==1)
            System.out.println(0);
        else if(d>0)
        {
            System.out.print(d);
           for(int i=2;i<=k;i++)
           {
                System.out.print(0);
           }
        }
        else
        {
            System.out.println("No solution");
        }
    }
    
}
