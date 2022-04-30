import java.util.Scanner;

public class littlepingandwolf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        char arr[][]=new char[rows+2][columns+2];
        int count=0;
        // Arrays.fill(arr,null);
       
        for(int i=1;i<=rows;i++)
        {
            String a=sc.next();
            for(int j=1;j<= columns;j++)
            {
                arr[i][j]=a.charAt(j-1);
                // System.out.println(arr[i][j]);
            }
        }
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=columns;j++)
            {
                if(arr[i][j]=='W')
                {
                    if(arr[i-1][j]=='P' || arr[i+1][j]=='P' || arr[i][j-1]=='P' || arr[i][j+1]=='P')
                    {
                        count++;
                    }
                }
            }
            
        }

        System.out.println(count);

    }
    
}
