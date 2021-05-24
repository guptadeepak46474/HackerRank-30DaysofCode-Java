import java.util.*;

public class Day5 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 10; i++) {
            int result = n*i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}