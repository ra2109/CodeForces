import java.util.ArrayList;

public class main implements Runnable {
    String str1;
    String str2;
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            str1="welcomw";
            str2="jaba";
            System.out.println(str1+" "+str2+" ");
        }
    }


    public static void main(String[] args)
     {

        main run=new main();
        Thread obj1=new Thread(run);
        Thread obj2=new Thread();
        obj1.start();
        obj2.run();


        
    }
  

    
}
