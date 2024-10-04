import java.util.Scanner;

public class IT24102651Lab7Q1A {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int subject,subject1, subject2, subject3, subject4;
        double average;

        System.out.println("Enter marks for four  subjects : ");
	
        
        System.out.print("Enter Subject Mark 1: ");
        subject1 = scanner.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        subject2 = scanner.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        subject3 = scanner.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        subject4 = scanner.nextInt();

        
        average = (subject1 + subject2 + subject3 + subject4) / 4.0;

        
        System.out.println("Average is: " + average);

        
        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Overall Grade: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Overall Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }

        
        scanner.close();
    }
}
