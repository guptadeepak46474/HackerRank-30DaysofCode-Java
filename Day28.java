import java.util.regex.*;
import java.util.*;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        Pattern pat = Pattern.compile("@gmail.com");
        int n = sc.nextInt();
        while(n-- > 0) {
            String name = sc.next();
            String email = sc.next();
            Matcher mat = pat.matcher(email);
            if(mat.find()) {
                list.add(name);
            }
        }
        sc.close();
        Collections.sort(list);
        for(String name : list) {
            System.out.println(name);
        }
    }
}