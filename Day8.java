import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> hm = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            sc.nextLine();
            hm.put(name, phone);
        }
        while(sc.hasNext()) {
            String str = sc.next();
            if(hm.get(str) == null)
                System.out.println("Not found");
            else
                System.out.println(str + "=" + hm.get(str));
        }
        sc.close();
        
    }
}