import java.util.ArrayList;
import java.util.Scanner;

public class supercentralpoint {
    public static void main(String[] args) {
        
    
    ArrayList<coordinates> al=new ArrayList<>();
   
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=0;
    for(int k=0;k<n;k++)
    {
        int xcor=sc.nextInt();
        int ycor=sc.nextInt();

        coordinates c=new coordinates(xcor, ycor);
        al.add(c);

    }

    for(int i=0;i<n;i++)
    {
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        for(int j=0;j<n;j++)
        {
            if(al.get(i).getxcordinate()>al.get(j).getxcordinate() && al.get(i).getycoordinate()==al.get(j).getycoordinate())
            {
                c1++;
            }
            else if(al.get(i).getxcordinate()<al.get(j).getxcordinate() && al.get(i).getycoordinate()==al.get(j).getycoordinate())
            {
                c2++;
            }
            else if(al.get(i).getxcordinate()==al.get(j).getxcordinate() && al.get(i).getycoordinate()>al.get(j).getycoordinate())
            {
                c3++;
            }
            else if(al.get(i).getxcordinate()==al.get(j).getxcordinate() && al.get(i).getycoordinate()<al.get(j).getycoordinate())
            {
                c4++;
            }

        }
        // System.out.println(c1+" "+c2+" "+c3+" "+c4);
        if(c1>=1 && c2>=1 && c3>=1 && c4>=1)
            ans++;
    }
    System.out.println(ans);


    
}
}

class coordinates
{

    int x;
    int y;
    
    coordinates(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getxcordinate()
    {
        return this.x;

    }
    public int getycoordinate()
    {
        return this.y;
    }



}
