import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class PalindromicTimes {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        a=a.replace(":", "");
        //  System.out.println(a);

        int time=Integer.parseInt(a);
        if(time==2359)
        {
            System.out.println("00:00");
            return;
        }
        System.out.println(Character.isDigit(a.charAt(0)));
        String hh=Integer.toString(a.charAt(0))+""+Integer.toString(a.charAt(1));
        String mm=Integer.toString(a.charAt(2))+""+Integer.toString(a.charAt(3));
        int HH=Integer.parseInt(hh);
        int MM=Integer.parseInt(mm);
        for(int i=HH;i<24;i++)
        {
            for(int j=MM;j<59;j++)
            {
                StringBuilder sb=new StringBuilder(j);
                int c=Integer.parseInt(sb.reverse().toString());
                if(c==i)
                {
                    System.out.println(i+":"+j);
                    return;
                }
            }

        }
            
        while(true)
        {
            ++MM;
            if(MM==60)
            {
                HH++;
                MM=0;
            }
            StringBuilder sb=new StringBuilder(MM);
            int c=Integer.parseInt(sb.reverse().toString());
            if(c==HH)
            {
                System.out.println(HH+MM);
            }
         
            
        }
      



    }
    
}
