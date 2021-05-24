import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        String str = Integer.toBinaryString(n);
        // String str = Integer.toString(n, 2);
        String[] strparts = str.split("0");
        for(int i = 0; i < strparts.length; i++) {
            if(count < strparts[i].length())
                count = strparts[i].length();
        }
        System.out.println(count);
    }
}