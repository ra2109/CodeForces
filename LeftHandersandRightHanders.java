import java.util.Scanner;

public class LeftHandersandRightHanders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();

        int j=n/2;
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)=='L' && s.charAt(j)=='R')
            {
                System.out.println(i);
                System.out.print((i+1) +" "+ (j+1));
            }
            else
            {
                
                System.out.println((j+1) +" "+ (i+1));
            }
            j++;
        }
       
        

    }
    
}
