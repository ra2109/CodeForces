import java.io.IOException;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class puzzle {
    public static void main(String[] args)throws IOException {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
       
       for(int i=0;i<m-n+1;i++)
       {
          
                min=Math.min(min,arr[i+n-1]-arr[i]);
       }
        // System.out.println(m);
        // System.out.println(n);
        
        System.out.println(min);

    }
    
}
// import java.io.IOException;
// import java.util.Arrays;
// import java.util.Scanner;

// /**
//  * A. Puzzles
//  *
//  * http://codeforces.com/problemset/problem/337/A
//  */
// public class puzzle {
//     public static void main(String[] args) throws IOException {
//         Program p = new Program();
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();
//         int m = scanner.nextInt();
//         int[] pieces = new int[m];
//         for (int i = 0; i < m; i++)
//             pieces[i] = scanner.nextInt();

//         Arrays.sort(pieces);
//         p.run(n,m,pieces);
//     }

//     public static class Program {
//         public void run(int n, int m, int[] f) {
//             int min = Integer.MAX_VALUE;
//             for(int i = 0; i < m - n + 1; i++) {
//                 min = Math.min(min, f[i+n-1] - f[i]);
//             }
//             System.out.println(min);
//         }
//     }
// }
