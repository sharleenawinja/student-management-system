import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
       

        // ask how many students the user wants to add 
        System.out.print("Enter number of new students to enroll: ");
        try (Scanner in = new Scanner(System.in)) {
            int numberOfStudents = in.nextInt();
            Student[] students = new Student[numberOfStudents];

            // create n number of students
            for(int i = 0; i < numberOfStudents; i++) {
                students[i] = new Student();
                students[i].enroll();
                students[i].payTuition();
                System.out.println(students[i].showInfo()); 
                System.out.println(students[i].toString());

            }
            System.out.println(students[0].toString());
        }
       

    }
}