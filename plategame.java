import java.util.Scanner;

public class plategame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();

        double area_square=a*b;
        double area_circle=(22*r*r)/7;

        double output =area_square/area_circle;
        System.out.println(area_square);
        System.out.println(area_circle);

        if(output<1 || output %2==0)
            System.out.println("Second");
        else
        {
            System.out.println("First");

        // if(2*r>Math.min(a, b))
        // {
        //     System.out.println("Second");

        // }
        // else
        // {
        //     System.out.println("First");
        // }
    

        }







    }
}
    

