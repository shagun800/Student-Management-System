
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(Scanner scanner) {
        System.out.println("Enter student name: ");
        String name = scanner.next() + scanner.nextLine();
        System.out.println("Enter student roll number: ");
        int rollNumber = scanner.nextInt();
        Student student = new Student(name, rollNumber);
        students.add(student);
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\n==== Student List ====");
        for (Student student : students) {
            System.out.println("Name: " + student.getStudentName() + ", Roll Number: " + student.getRollNumber());
        }
    }

    static void searchStudentByRollNumber(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found: Name: " + student.getStudentName() + ", Roll Number: " + student.getRollNumber());
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;;
        while (choice != 4) {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                addStudent(scanner);
            } else if (choice == 2) {
                displayStudents();
            } else if (choice == 3) {
                System.out.print("Enter roll number to search: ");
                int rollNumber = scanner.nextInt();
                searchStudentByRollNumber(rollNumber);
            } else if (choice == 4) {

            } else {
                System.out.println("Invalid choice.");
            }

        }
        scanner.close();
    }
}
