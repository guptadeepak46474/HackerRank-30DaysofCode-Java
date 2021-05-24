import java.util.*;

public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int s = Integer.parseInt(sc.next());
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
        sc.close();
    }
}