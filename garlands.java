import java.util.*;
public class garlands {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int ans=0;
        int[] a1=new int[26];
        int[] b1=new int[26];


        for(int i=0;i<a.length();i++)
        {
            a1[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            b1[b.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++)
        {
            if(b1[i]!=0 && a1[i]==0)
            {
                ans=-1;
                break;
            }
            else
            {
                ans+=Math.min(a1[i],b1[i]);
            }
        }

        System.out.println(ans);

    }
    
}
