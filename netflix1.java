import java.io.BufferedReader;
import java.io.FileReader;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class netflix1 {
    static List<List<String>> al=new ArrayList<>();
        public static void main(String[] args) throws Exception {
        
        BufferedReader br=new BufferedReader(new FileReader("D:/netflix_titles.csv"));
        String line;
        // String line2;
       
        netflix1 netflix=new netflix1();
        netflix1.searchByCountry("India");
        while((line=br.readLine())!=null)
        {
           
             String line2=br.readLine();
            // if(line2!=null && line2.charAt(0)!='s')
            // {
            //     line=line+line2;
            // }
            //  String v1[]=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            //   List<String> l1=Arrays.asList(v1);
            //  al.add(Arrays.asList(v1));
            
            if(line2!=null)
            {
                if(line2.charAt(0)!='s')
                {
                    line=line+line2;
                     String v1[]=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                    al.add(Arrays.asList(v1));
                    // line2="";
                }
                else
                {
                String v1[]=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                al.add(Arrays.asList(v1));
                String v2[]=line2.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                al.add(Arrays.asList(v2));
                }

            }
            else

           { 
               String v1[]=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
               al.add(Arrays.asList(v1));
        }
           

        }
        int count=0;


        
        // Country

       
       
        //Tv SHows
        // for(int i=0;i<al.size();i++)
        // {
           
        //     if(al.get(i).get(1).contains("TV Show"))
        //     {
        //         System.out.println(al.get(i));
        //         count++;
        //     }
            
            
        // }

        //Horror Movies

        //     for(int i=0;i<al.size();i++)
        // {
           
        //     if(al.get(i).get(10).contains("Horror Movies"))
        //     {
        //         System.out.println(al.get(i));
        //         count++;
        //     }
        //     // System.out.println(al.get(i).get(10));
            
        //     // System.out.println(al.get(i));
        // }
        // System.out.println(al.get(6660));


        // System.out.println(count);

        // search by dates

        // Date date1=null;
        // Date date2=null;
        // Scanner sc = new Scanner(System.in);
        // SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yy");
        // System.out.println("Enter check-in date (gg/aa/yy):");
        // String d1 = sc.nextLine();
        // String  d2=sc.nextLine();
        // // (null != d2 && d2.trim().length() > 0 )
        // if((null != d1 && d1.trim().length() > 0 ) && (null != d2 && d2.trim().length() > 0 ))
        // {
        //      date1 = format.parse(d1);
        //      date2=format.parse(d2);

        // }
        
        // for(int i=1;i<al.size();i++)
        // {
        //         if(al.get(i).get(6).length()==9)
        //     { 
        //         //   count++;
        //         //   System.out.println(al.get(i).get(6));
        //           Date date3=format.parse(al.get(i).get(6));
        //         //   System.out.println(date3);
        //         if(date3.after(date1) && date3.before(date2))
        //         {
        //             System.out.println(al.get(i));
        //             count++;
        //         }
        //     }
            
        //     // if(al.get(i).get(6).length()!=0)
        //     // {
        //     //     System.out.println(al.get(i).get(6).length());
        //     // }

        //   }
          System.out.println(count);
        }
        

        public static void  searchByCountry(String country)
        {
            int count=0;
            for(int i=0;i<al.size();i++)
            {
               
                if(al.get(i).get(5).contains(country))
                {
                    System.out.println(al.get(i));
                    count++;
                }
                
                
            }
            System.out.println(count);
        }
     
        }
    

