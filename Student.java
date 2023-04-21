import java.util.Scanner;
import java.io.InputStream;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;


    // constructor prompts users to enter student name and year
    public Student() {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
    }

    // generate an id

    // enroll in courses

    // view balance

    // pay tuition

    // show status
}
