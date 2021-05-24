import java.util.*;

public class Day4 {
    private int age;	
  
	public Day4(int initialAge) {
        if(initialAge >= 0)
            age = initialAge;
        else {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
	}

	public void amIOld() {
        String str;
        if(age < 13)
            str = "You are young.";
        else if(age >= 13 && age < 18)
            str = "You are a teenager.";
        else
            str = "You are old.";
        System.out.println(str);
	}

	public void yearPasses() {
        age++;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4 p = new Day4(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}