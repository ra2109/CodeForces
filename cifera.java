import java.util.Scanner;

public class cifera {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=sc.nextInt();
        int i=1;
        if(number%n!=0)
            {
                System.out.println("NO");
                return;
            }
       
        else
        {
            while(Math.pow(n, i)<=number)
            {
                i++;
                // System.out.println(Math.pow(n, i));
                
            }
            if(Math.pow(n, i-1)!=number)
            {
                System.out.println("NO");
                return;
            }
        }
       
        System.out.println("YES");
        System.out.println(i-2);

        
    }
    
}
