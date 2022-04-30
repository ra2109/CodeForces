import java.util.Scanner;

public class GameWithSticks
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int count=0;
        while(row!=0 && column!=0)
        {
            count++;
            row--;
            column--;
        }
        
        if(count%2==0)
            System.out.println("Malvika");
        else
            System.out.println("Akshat");

        
    }
}