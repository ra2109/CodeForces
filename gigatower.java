import java.util.Scanner;

public class gigatower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        for(i=a+1;;i++)
        {
            // System.out.println(i);
            String str=Integer.toString(i);
            if(str.contains("8"))
                break;
        
        }
        System.out.println((i-a));
    }
    
}
