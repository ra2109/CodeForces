import java.util.Scanner;

public class funkynumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int k1=0;
        int k2=0;

        for(int k1=1;k1<Math.sqrt(n);k1++)
        {
            
           
             k2 = (int)(Math.sqrt((n-(k1*(k1+1)/2)) * 2));
            
            //  System.out.println(k1);
            //  System.out.println(k2);

             if( (k1*(k1+1))/2 + (k2*(k2+1))/2 == n)
                {
                    System.out.println("YES");
                    return;
                }

        }
        System.out.println("NO");
        
    }
    
}
