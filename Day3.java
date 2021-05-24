import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println((n % 2 == 1 ||  (n > 5 && n < 21 ) ? "Weird" : "Not Weird") );
    }
}