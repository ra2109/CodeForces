import java.util.Scanner;

public class chatroom {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String hello="hello";
        int j=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==hello.charAt(j))
                j++;
            if(j==5)
                break;

        }
        if(j==5)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
