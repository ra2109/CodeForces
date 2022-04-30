import java.util.Scanner;
import java.util.*;


public class Stringtask
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            a=Character.toUpperCase(a);
            if(!(Character.toUpperCase(a)=='A' || Character.toUpperCase(a)=='E'|| Character.toUpperCase(a)=='I'||Character.toUpperCase(a)=='O' || Character.toUpperCase(a)=='U'||Character.toUpperCase(a)=='Y'))
            {
                // System.out.println(a);
                 char b=Character.toLowerCase(a);
                ans=ans+"."+b;
            }
        }
        System.out.println(ans);
    }
}