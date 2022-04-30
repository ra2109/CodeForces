import java.util.Scanner;

public class marks {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int student=sc.nextInt();
       int subject=sc.nextInt();
        int count=0;
       int a[][]=new int[student][subject];

       for(int i=0;i<student;i++)
       {
           for(int j=0;j<subject;j++)
           {
               a[i][j]=sc.nextInt();
           }
       }
    //    Arrays.sort(a);
    for (int i = 0; i < student; ++i){   
        boolean wasBest = false;
        for(int j = 0; j < subject; ++j){
            boolean isBest = true;
            for(int k = 0; k < student; ++k)
                if(a[k][j] > a[i][j])
                    isBest = false;
            if(isBest)        
                wasBest = true;
        }
        if(wasBest)
            count++;
    }      
       System.out.println(count);


   }
}
