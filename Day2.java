import java.util.*;
import java.lang.Math;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meal_cost = sc.nextDouble();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();
        sc.close();

        
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double total = meal_cost + tip + tax;

        System.out.println(Math.round(total));
    }
}