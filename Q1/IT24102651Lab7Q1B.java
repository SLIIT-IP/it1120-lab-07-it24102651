import java.util.Scanner;

public class IT24102651Lab7Q1B {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        
        for (int student = 1;student<=4;student++)
		{
			System.out.println("Student " + student);
			System.out.print("Enter marks: " );
			
	    
            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
            int subject4 = scanner.nextInt();
			
        double average;
	    
        average = (subject1 + subject2 + subject3 + subject4) / 4.0;
		
	
        System.out.println("Average is: " + average);

       
		

        
        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade is: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Overall Grade: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Overall Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
		}
        
        scanner.close();
    }
}
