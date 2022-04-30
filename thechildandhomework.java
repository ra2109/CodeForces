import java.util.ArrayList;
import java.util.Scanner;

public class thechildandhomework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();

        int alen=a.length()-2;
        int blen=b.length()-2;
        int clen=c.length()-2;
        int dlen=d.length()-2;
        String choice="ABCD";
        al.add(alen);
        al.add(blen);
        al.add(clen);
        al.add(dlen);

        //2 5 2 3
        int i;
        for(i=0;i<4;i++)
        {
            int count1=0;
            int count2=0;
            int j;
            for( j=0;j<4;j++)
            {
                if(i==j)
                    continue;
                if(al.get(i)*2>al.get(j))
                {
                    count1++;
                }
                if(al.get(j)*2>al.get(i))
                {
                    count2++;
                }
            }
            // System.out.println(i+" "+j);
            // System.out.println(count1+" "+count2);
            if(count1==3 || count2==3)
            {
                System.out.println(choice.charAt(i));
                return;
            }
        }
        System.out.println(choice.charAt(2));



    }
    
}
