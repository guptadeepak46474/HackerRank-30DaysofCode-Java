import java.util.*;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            int x = sc.nextInt();
            boolean flag = true;
            if(x == 1)
                flag = false;
            for(int i = 2; i <= x/i; i++) {
                if(x % i == 0)
                    flag = false;
            }
            if(flag)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        sc.close();
    }
}