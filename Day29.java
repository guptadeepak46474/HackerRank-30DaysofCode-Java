import java.util.*;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            int max = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i = 1; i < a; i++) {
                for(int j = i+1; j <= a; j++){
                    if( (i&j) > max && (i&j) < b )
                        max = (i&j);
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}