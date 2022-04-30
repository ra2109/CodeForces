import java.util.ArrayList;
import java.util.Scanner;

public class bar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] arr=new String[]{"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY","WINE"};

        int count=0;
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.next());
        }
        for(int i=0;i<n;i++)
        {
            if(al.get(i).charAt(0)>=48 && al.get(i).charAt(0)<=57)
            {
                int val=0;
                for(int j=0;j<al.get(i).length();j++)
                {
                    val=val*10+al.get(i).charAt(j)-48;
                }

                if(val<18)
                   { 
                       count++;
                       
                }
                
            }
            else
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j].equals(al.get(i)))
                       { count++;
                        // System.out.println(count+"alc");
                        }
                }
            }
        }
       
        System.out.println(count);
    }
    
}
