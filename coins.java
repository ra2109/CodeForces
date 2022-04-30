import java.util.*;
public class coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n!=1)
        {
            System.out.println(n);
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    n=n/i;
                    break;
                }
            }
        }
        System.out.println(n);
    }
    
}
  