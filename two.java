import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        int a[][]=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                a[i][j]=sc.nextInt();
            }

        }
        for(int[] x:a)
        {
            for(int y:x)
            {
                System.out.println(y+" ");
            }
            System.out.println();
        }
    }
    
}
