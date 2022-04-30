import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class combinationNew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int moves=1;
        int score =0;
        ArrayList<Integer>  al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            if(b!=0)
            {
                score+=a;
                moves+=b-1;
            }
            else
            {
                al.add(a);
            }
        }
        Collections.sort(al);
        for(int i=al.size()-1;i>=0;i--)
        {
            if(moves>0)
            {
                score+=al.get(i);
                moves=moves-1;
            }
            else
            {
                break;
            }
        }
        System.out.println(score);
    }
    
}
