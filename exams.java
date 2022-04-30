import java.util.Scanner;

public class exams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        int k=sc.nextInt();
    
        if((3*n)<=k)
            System.out.println(0);
        else
        {
            System.out.println((3*n)-k);
        }  
    }
   
    
}
