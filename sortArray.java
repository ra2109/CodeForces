import java.util.*;


public class sortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];


        int left=0;
        int right=0;
        boolean fleft=false;
        boolean fright=false;
        boolean flag=true;
        String ans="";
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1] )
            {
                if(fleft==false)
                { 
                   left=i-1;
                    fleft=true;
            
                }
                if(fright==true)
                {
                    ans="no";
                    flag=false;
                    break;
                }

                if(i==n-1 && fright==false)
                {
                    if(left==0)
                        right=i;
                    else
                    {
                        if(arr[i]<arr[left-1])
                           { ans="no";
                            flag=false;}
                        else
                            right=i;

                    }
                }

            }
            else if(arr[i-1]<arr[i])
            {
                if(fleft==true && fright==false)
                   {
                       if(arr[left]<arr[i])
                       {
                           right=i-1;
                           fright=true;
                       }
                       else
                       {
                           ans="no";
                           flag=false;
                           break;
                       }
                   }
            }
           
        }
        if(flag==true)
        {
           ans="yes";
           left++;
           right++;
           System.out.println(ans);
           System.out.println(left+" "+right);
        }
        else
            System.out.println(ans);
       
     


  
    }
    
}
