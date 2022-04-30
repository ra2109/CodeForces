import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Combination {

   
    class Node
    {
         public int points;
         public int cards;
        Node(int a,int b)
        {
            this.points=a;
            this.cards=b;
        }
    }
    public  static  class customsort implements Comparator<Node>

    {

        @Override
        public int compare(Node o1, Node o2) {
            if(o1.cards==o2.cards) 
                return o1.points-o2.points; 
            else
                return o1.cards-o2.cards;
            
           

    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        Node[] cards=new Node[n];

        for(int i=0;i<n;i++)
        {
            
            cards[i].points=sc.nextInt();
            cards[i].cards=sc.nextInt();
        }
        Arrays.sort(cards);

       for(Node a:cards)
       {
           System.out.println(a.cards);
           System.out.println(a.points);
       }
       
       
     
    }
}
    

