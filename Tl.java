import java.util.Scanner;
import java.util.Arrays;   
public class Tl {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int correct=sc.nextInt();
        int wrong=sc.nextInt();

        int arr1[]=new int[correct];
        int arr2[]=new int[wrong];

        for(int i=0;i<correct;i++)
        {
            arr1[i]=sc.nextInt();

        }
        for(int i=0;i<wrong;i++)
        {
            arr2[i]=sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // for(int i:arr1)
        // {
        //     System.out.println(i);
        // }
      
        int b=Math.max(arr1[0]*2,arr1[correct-1]);
        // System.out.println(b);
        if(b<arr2[0])
            System.out.println(b);
        else
            System.out.println(-1);





    }
}
