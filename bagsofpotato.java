import java.util.Scanner;

public class bagsofpotato {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int y=sc.nextInt();
        int k=sc.nextInt();
        int n=sc.nextInt();

        int top=n-y;
        int x=k-y%k;

        if(x<=top)
        {
            System.out.print(x+" ");
            x=x+k;
            while(x<=top)
            {
                System.out.print(x+" ");
                x=x+k;
            }
        }
        else
            System.out.println(-1);
    }
}

