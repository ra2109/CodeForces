import java.util.Scanner;

public class Guessanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int left=Integer.MIN_VALUE;
        int right=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            String a=sc.next();
            if(Character.toString(a.charAt(0))==">" && Character.toString(a.charAt(4))=="Y")
                left=Math.max(left,(int)a.charAt(1));
            else
                {right=Math.min((int)a.charAt(2)+1, right);}
            if(Character.toString(a.charAt(0))==">=" && Character.toString(a.charAt(4))=="Y")
                left=Math.max(left,(int)a.charAt(2)-1);
            else
                {right=Math.min((int)a.charAt(2), right);}
            if(Character.toString(a.charAt(0))=="<" && Character.toString(a.charAt(4))=="Y")
                right=Math.min((int)a.charAt(2), right);
            else
                {left=Math.max(left,a.charAt(2)-1);}
            if(Character.toString(a.charAt(0))=="<=" && Character.toString(a.charAt(4))=="Y")
                right=Math.min((int)a.charAt(2)+1, right);
            else
                {left=Math.max(left,(int)a.charAt(2));}
            

           


        }
        // if(left+2<=right)
        // {
        //     System.out.println(left+1);
        // }
        

        if(left+2<=right)
       { for(int i=left;i<=right;i++)
        {
            if(i!=right)
                System.out.println(i+" ");
            else
                {System.out.println(i);}
        }
    }
        else
        {
            System.out.println("Impossible");
        }
    }
    
}
