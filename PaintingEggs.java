import java.util.*;
public class PaintingEggs {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];

        int sumA=0;
        int sumB=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {

            sumA=sumA+A[i];
            if(Math.abs(sumA-sumB)<=500)
                {
                    sb.append("A");
                }
            else
            {
                sumA=sumA-A[i];
                sumB=sumB+B[i];
                // sumB+=sumB+(1000-A[i]); 
                if(Math.abs(sumA-sumB)<=500)
                    sb.append("G");
            }
            
        }
        if(sb.toString().length()==0)
            System.out.println(-1);
        else
            System.out.println(sb.toString());

    }
}
