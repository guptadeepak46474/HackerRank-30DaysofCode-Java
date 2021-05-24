import java.util.*;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> arr = new Vector<Integer>(n);
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        for(int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }
}