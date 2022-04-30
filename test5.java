
import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {

        int count=0;
        boolean flag=true;
        String s="abcdae";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()-1;j++)
            {
                String a=s.substring(i, j);
                int[] b=new int[26];
                for(int k=0;k<a.length();k++)
                {
                    b[a.charAt(i)-'a']++;
                }
                for(int k=0;k<26;k++)
                {
                    if(b[k]>1)
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag==true)
                {
                    count=Math.max(count,a.length());
                }

            }
        }
        System.out.println(count);



    }
    
}


Given a string S, find length of the longest substring with all distinct characters.
Input: abcdae
Output : 5
("bcdae" has all unique characters)