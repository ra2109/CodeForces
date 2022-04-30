import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class netflix {
    public static void main(String[] args) throws Exception {
        String splitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader("D:/netflix_titles.csv"));
        String line = br.readLine();
        
        List<List<String>> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            String[] b = line.split(splitBy);
            boolean flag = false;
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < b.length; i++) {

                if (b[i].length() > 0
                        && ((b[i].charAt(0) != '\"' && b[i].charAt(b[i].length() - 1) != '\"') && flag == false)) {
                    temp.add(b[i]);

                } else if (b[i].length() > 0 && (b[i].charAt(0) == '\"')) {
                    sb.append(b[i] + " ");
                    flag = true;
                } else if (b[i].length() > 0 && b[i].charAt(b[i].length() - 1) == '\"') {
                    if (flag == true) {
                        temp.add(sb.toString());
                        sb.setLength(0);
                        flag = false;
                    }

                } else {
                    sb.append(b[i] + " ");
                }
            }
            list.add(temp);
        }
        br.close();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).get(1).equals("TV Show")) {
                System.out.println(list.get(i));
            }

        }
    }
}
