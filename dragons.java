import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int powstarting=sc.nextInt();
        int level=sc.nextInt();
       ArrayList<power> al=new ArrayList<>();
       
        for(int i=0;i<level;i++)
        {
            int strength=sc.nextInt();
            int bonus=sc.nextInt();
            power temp=new power(strength, bonus);
            al.add(temp);

        
        }

       Collections.sort(al, new Comparator<power>(){
           public int compare(power p1,power p2)
           {
               return p1.getstrenght()-p2.getstrenght();
           }
           
       });
        
       for(int i=0;i<al.size();i++)
       {
           if(powstarting>al.get(i).getstrenght())
           {
               powstarting=powstarting+al.get(i).getbonus();
           }
           else
               { 
                   System.out.println("NO");
                    return;
               }

        
       }
       System.out.println("YES");
     
        
            
        }
    }

    class power{
        int strenght;
        int bonus;

        power(int strenght,int bonus)
        {
            this.strenght=strenght;
            this.bonus=bonus;
        
        }
        public int getstrenght()
        {
            return this.strenght;
        }
        public int getbonus()
        {
            return this.bonus;
        }
    }
    

