import java.util.*;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();

        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();

        sc.close();

        int sum = 0;

        if(y1 > y2) {
            sum = 10000;
        } else if(y1==y2) {
            if(m1 > m2) {
                sum = 500 * (m1-m2);
            } else if(d1 > d2){
                sum = 15 * (d1 - d2);
            } else {
                sum = 0;
            }
        } else {
            sum = 0;
        }

        System.out.println(sum);
    }
}