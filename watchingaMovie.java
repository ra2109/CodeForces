import java.util.Scanner;

public class watchingaMovie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int current=1;
        int ans=0;
        int n=sc.nextInt();
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            while(current+x<=a)
            {
                current=current+x;

            }
            ans=ans+b-current+1;
            current=b+1;
        }
        System.out.println(ans);

    }
    
}
