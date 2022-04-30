import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String rank="6789TJQKA";

        String suit=sc.next();
        String card1=sc.next();
        String card2=sc.next();

        String a=Character.toString(card1.charAt(0));
        String b=Character.toString(card2.charAt(0));

        if((card1.charAt(1)==card2.charAt(1) && rank.indexOf(a)>rank.indexOf(b))  
        || (card1.charAt(1)!=card2.charAt(1) && Character.toString(card1.charAt(1)).equals(suit) ))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
  

    }
    
}
