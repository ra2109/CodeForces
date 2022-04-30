import java.util.Scanner;

public class littlegirlandgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();

        int[]count=new int[27];
        
        for(int i=0;i<a.length();i++ )
        {
            count[a.charAt(i)-'a']++;
        }

        int count_odd=0;
        for(int i=0;i<27;i++)
        {
            if(count[i]%2!=0)
                count_odd++;
        }
        if(count_odd==0)
            System.out.println("First");
        else if(count_odd==1)
            System.out.println("First");
        else if(count_odd%2==0)
            System.out.println("Second");
        else
            System.out.println("First");
    }
    
}
