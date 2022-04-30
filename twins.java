import java.util.Arrays;
import java.util.Scanner;

public class twins
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int total=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            total=total+arr[i];

        }
        total=total/2;
        Arrays.sort(arr);
        int count=0;
        int child=0;
        for(int i=n-1;i>=0;i--)
        {   
            child=child+arr[i];
            if(child>total)
                break;
            else
                count++;


        }
        System.out.println(count+1);


        

    }   
}