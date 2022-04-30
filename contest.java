import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int misha_question=sc.nextInt();
        int vasaya_question=sc.nextInt();
        int mishtime=sc.nextInt();
        int vasayatime=sc.nextInt();

        int mish=Math.max((3*misha_question)/10,misha_question-(misha_question/250)*mishtime);
        int vasay=Math.max((3*vasaya_question)/10,vasaya_question-(vasaya_question/250)*vasayatime);

        if(mish>vasay)
        {
            System.out.println("Misha");
        }
        else if(mish<vasay)
        {
            System.out.println("Vasya");
        }
        else
        {
            System.out.println("Tie");
        }
    }
    
}
