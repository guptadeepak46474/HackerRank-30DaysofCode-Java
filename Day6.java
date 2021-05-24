import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0) {
            String str = sc.next();
            String even, odd;
            even = odd = "";
            char[] result = str.toCharArray();
            for(int i = 0; i < result.length; i++) {
                if(i % 2 == 0)
                    even += result[i];
                else
                    odd += result[i];
            }
            System.out.println(even + " " + odd);
            n--;
        }
        sc.close();
    }
}