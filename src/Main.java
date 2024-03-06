import java.util.Scanner;

public class Main {
 public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Student Details Entry System!");

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering details for Student " + (i + 1));
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter the number of extra activities: ");
            int numExtraActivities = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Student student = new Student(studentID, studentName, numExtraActivities);

            for (int j = 0; j < numExtraActivities; j++) {
                System.out.print("Enter extra activity " + (j + 1) + ": ");
                String activity = scanner.nextLine();
                student.addExtraActivity(j, activity);
            }

            students[i] = student;
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":\n" + students[i]);
        }
    }
 }

