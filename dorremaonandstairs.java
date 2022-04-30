import java.util.Scanner;

public class dorremaonandstairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int stairs=sc.nextInt();
        int ways=sc.nextInt();

        int count=0;
        if(stairs<ways)
            {
                System.out.println(-1);
                return;
            }
        if(stairs%2==0)
            count=stairs/2;
        else
            count=(stairs/2)+1;
        
        
        while(count%ways!=0)
            {
                count++;
            }
    System.out.println(count);



    }
    
}
