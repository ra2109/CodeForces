
import java.util.Scanner;
public class cutribbion {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int rib_size=sc.nextInt();
        int[] arr=new int[3];
        int count=0;

        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }

        // Arrays.sort(arr);
        
        
            if(arr[0]+arr[1]+arr[2]==rib_size)
               { 
                   count=3;
                //    return;
                }
            else if(arr[0]+arr[1]==rib_size || arr[0]+arr[2]==rib_size ||arr[1]+arr[2]==rib_size)
                { 
                   count=2;
                //    return;
                }
            else
            {
            
                if(arr[0]==rib_size  || arr[1]==rib_size || arr[1]==rib_size)
                {
                    count=1;
                    
                }
                else
                    count=rib_size;
            }
           

        System.out.println(count);



       
        
    }
    
}
