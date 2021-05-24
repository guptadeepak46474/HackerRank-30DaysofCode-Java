import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    Student(String firstName, String lastName, int identification ,int[] tS) {
        super(firstName, lastName, identification);
        testScores = tS;
    }

    int sum = 0, result;
    
    public char calculate() {
        for(int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        result = sum / testScores.length;

        if(90 <= result && result <= 100)
            // System.out.println("O");
            return 'O';
        else if (80 <= result && result < 90) {
            // System.out.println("E");
            return 'E';
        }
        else if (70 <= result && result < 80) {
            // System.out.println("A");
            return 'A';
        }
        else if (55 <= result && result < 70) {
            // System.out.println("P");
            return 'P';
        }
        else if (40 <= result && result < 55) {
            // System.out.println("D");
            return 'D';
        }
        else if(0<=result && result<40)
            // System.out.println("T");
            return 'T';
        else
            return Character.MIN_VALUE;
    }
}

class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}