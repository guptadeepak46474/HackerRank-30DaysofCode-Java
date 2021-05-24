import java.util.*;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i-- > 0) {
            try {
                int n = sc.nextInt();
                int p = sc.nextInt();
                if(n >= 0 && p >= 0) {
                    System.out.println((int)(Math.pow(n, p)));
                } else
                    throw new Exception("e");
            } catch (Exception e) {
                System.out.println("n and p should be non-negative");
            }
        }
        sc.close();
    }
}