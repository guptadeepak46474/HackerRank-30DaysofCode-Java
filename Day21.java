import java.util.*;

class Printer1 <T> {
    void printArray(T[] arr) {
        for(T n : arr)
            System.out.println(n);
        
    }
}

public class Day21 {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        scanner.close();
        Printer1<Integer> intPrinter = new Printer1<Integer>();
        Printer1<String> stringPrinter = new Printer1<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer1.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}