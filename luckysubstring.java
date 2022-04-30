import java.util.Scanner;
import java.util.*;
public class luckysubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count_4=0;
        int count_7=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='7')
                count_7++;
            if(s.charAt(i)=='4')
                count_4++;
        }
        if(count_4==0 && count_7==0)
            System.out.println(-1);
        else
            {
                if(count_7>count_4)
                    System.out.println(7);
                // else if(count_7>count_4)
                //     System.out.println(7);
                else
                    System.out.println(4);
            }

    }
    
}
