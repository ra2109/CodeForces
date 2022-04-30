import java.util.*;
public class randomteam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int participants=sc.nextInt();
        int team=sc.nextInt();
        long max=0;
        long min=0;
        long player=participants/team;
        long playes_leftt=participants%team;
        long x=participants-team+1;
         max=(x*(x-1))/2;

        min= ((player*(player-1))/2)*(team-playes_leftt)+playes_leftt*((((player+1)*player))/2);

        System.out.print(min+" "+max);
      

    }
    
}
