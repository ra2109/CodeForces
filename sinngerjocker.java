import java.util.Scanner;

 public class sinngerjocker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int event_num=sc.nextInt();
        int toatl_time=sc.nextInt();
        int sum=0;
        int total_jokes=0;
        int arr[]=new int[event_num];
        for(int i=0;i<event_num;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];

        }

        if(toatl_time<sum+(event_num-1)*10)
        {
            System.out.println("-1");
            return;
        }
        else
        {
            total_jokes=(((event_num-1)*10)/5)+(toatl_time-(sum+(event_num-1)*10))/5;
            System.out.println(total_jokes);

        }
    }


    
}
