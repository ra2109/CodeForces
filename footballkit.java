import java.util.Scanner;

public class footballkit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] home=new int[n];
        int[] away=new int[n];
        // int teams[][]=new int[n][n];

        int[] counthome=new int[100005];
        int temp=0;
        for(int i=0;i<n;i++)
        {
             temp=sc.nextInt();
            away[i]=sc.nextInt();
            counthome[temp]++;
        }
        int homegame=0;
        int awaygame=0;
        for(int i=0;i<n;i++)
        {
            // homegame=(n-1);
            // homegame=(n-1)+counthome[away[i]];
            // awaygame=2*(n-1)-homegame;

            System.out.println((n-1)+counthome[away[i]]+" "+((n-1)-counthome[away[i]]));
            // System.out.println("");

        }
        
    }
    
}
