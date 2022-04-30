import java.util.Scanner;

public class bTheGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int x=sc.nextInt();
        boolean[] flag1=new boolean[x+1];
        int a=sc.nextInt();
        int[] arr1=new int[a];
        for(int i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
            flag1[arr1[i]]=true;
        }
        int b=sc.nextInt();
        int[] arr2=new int[b];
        for(int i=0;i<b;i++)
        {
            arr2[i]=sc.nextInt();
            flag1[arr2[i]]=true;
        }

        for(int i=1;i<flag1.length;i++)
        {
            if(flag1[i]==false)
                {
                    System.out.println("Oh, my keyboard!");
                    return;
                }
        }
        System.out.println("I become the guy.");
        




        
    }
    
}

// 4
// 3
// 1 2 3
// 2
// 2 4
