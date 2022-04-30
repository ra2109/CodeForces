import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class scokets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> al=new ArrayList<>();
        int ext=sc.nextInt();
        int device=sc.nextInt();
        int sockets=sc.nextInt();
        int count=0;
       
        for(int i=0;i<ext;i++)
        {
            al.add(sc.nextInt());
        }
        Collections.sort(al);

       
        if(device<=sockets)
        {
            
            System.out.println(0);
            return;
        }
        // else if(sockets>device)
        
        else
        {
           
            int device_left=device-sockets+1;
            

            for(int i=al.size()-1;i>=0;i--)
            {
                if(al.get(i)>=device_left)
                   { 
                      
                    count++;
                       System.out.println(count);
                       return;
                    }
                

                else if(al.get(i)<device_left)
                {

                   
                    count++;
                  
                    device_left=device_left-(al.get(i)-1);
                   
                }
               
            }

        }
        System.out.println(-1);


    }
   
   
    
}


// 3 5 3
// 3 1 2