import java.util.Scanner;

public class AmrandPins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        double d=Math.sqrt(Math.pow(x1-x,2)+Math.pow(y-y1,2));
        // System.out.println(d);
        int distance=(int)(d/(2*r));
        // System.out.println((d%(2*r)));
        if((d%(2*r))!=0)
        {
            distance++;
        }

        System.out.println(distance);
    }
}

    

