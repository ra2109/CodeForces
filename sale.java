import java.util.Scanner;
import java.util.Arrays;
public class sale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] arr=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                sum+=Math.abs(arr[i]);
        }
        System.out.println(sum);

    }
    
}
