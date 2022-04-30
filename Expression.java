import java.util.Scanner;



public class Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a+b+c;
        int x=a+b*c;
        int y=a*(b+c);
        int z=a*b*c;
        int p=(a+b)*c;
        int r=a*b+c;  
       
        
        max=Math.max(max,x);
        max=Math.max(max,y);
        max=Math.max(max,z);
        max=Math.max(max,p);
        max=Math.max(max,r);
        System.out.println(max);
        
    }

    
}
