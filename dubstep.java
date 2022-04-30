import java.util.Scanner;

public class dubstep {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       String s=sc.next();
    //    String a=s.replaceAll("WUB","");
    //    a=a.trim();
    //    System.out.println(a);
        String[] arr=s.split("WUB");
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
                ans=ans+arr[i]+" ";
            else
                ans=ans+arr[i];
        }
        System.out.println(ans);

    }

    
}
