import java.util.Scanner;

public class lifewithoutzeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;

        String a1=Integer.toString(a);
        String b1=Integer.toString(b);
        String c1=Integer.toString(c);

        a1=a1.replace("0","");
        a=Integer.parseInt(a1);
        b1=b1.replace("0", "");
        b=Integer.parseInt(b1);
        c1=c1.replace("0", "");
        int c2=Integer.parseInt(c1);

      

        if(c2==a+b)
            System.out.println("YES");
        else
            System.out.println("NO");
        

       

    }
    
}
