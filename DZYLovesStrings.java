import java.util.Scanner;
import java.util.Arrays;
public class DZYLovesStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=sc.nextInt();

        

        int[] alpha=new int[26];
        

        for(int i=0;i<26;i++)
        {
            alpha[i]=sc.nextInt();
        }

        int sum=0;
        int max=0;

        int restsum=((b*((2*(a.length()+1))+(b-1)))/2);
        // System.out.println(restsum);
        for(int i=0;i<a.length();i++)
        {
            // max=Math.max(alpha[(a.charAt(i)-96)-1],max);
            sum=sum+(alpha[(a.charAt(i)-96)-1]*(i+1));
        }
      

        Arrays.sort(alpha);
        max=alpha[25];
        //  System.out.println(max);
        sum=sum+(restsum*max);
        System.out.println(sum);



    }
    
}
