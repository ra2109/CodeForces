import java.util.Scanner;

public class parellelpied {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();

        int a=(int)Math.sqrt((s1*s2)/s3);
        int b=(int)Math.sqrt((s1*s3)/s2);
        int c=(int)Math.sqrt((s2*s3)/s1);

        System.out.println((a+b+c)*4);

    }
    
}
