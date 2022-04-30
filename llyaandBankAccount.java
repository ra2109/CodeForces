import java.util.Scanner;

public class llyaandBankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int max=0;
        if(a>0)
            System.out.println(a);
        else
        {
            String b=Integer.toString(a);
            int x=Integer.parseInt(b.substring(0, b.length()-1));
            int y=Integer.parseInt(b.substring(0,b.length()-2)+b.substring(b.length()-1));

            max=Math.max(x, y);
            System.out.println(max);

           
        }

       



    }
    
}
