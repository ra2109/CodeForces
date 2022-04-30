import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("OK");
        al.add("1");
        al.add("6");

        for(String i:al)
        {
          
           System.out.println(i>4);
        }

    }
    
}
