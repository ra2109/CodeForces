import java.util.Scanner;

public class negativefirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int i=0;
        int j=0;
        while(j<n)
        {
            
                
            
            if(arr[j]<0)
            {
                if(i!=j)
                {
                    int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;

                     
                     i++;


                }
            }
            j++;
        
        }
        for(int k:arr)

        {
            System.out.println(k);
        }


    
}
}
