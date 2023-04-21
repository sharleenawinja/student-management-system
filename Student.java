import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;  
    private static int costOfCourse = 600; //static means that this value or property is not specific to an object but rather it is something that is true for all objects; kind of it belongs to the class and not the instance of the object; it is not true for the instace of the class ie the object...it is just true for the class
    private static int id = 1000; //this value will remain with the class and every time a new student is created it will be incremented by one 


    // constructor prompts users to enter student name and year
    public Student() {
        // in java the try with statement is a try statement that declares one or more resources
        // the resource is as an object that must be closed after finishing the program
        // the try with resources statement ensures that each resource is closed at the end  of the statement execution
        // You can pass any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable.
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter student first name:");
            this.firstName = in.nextLine();

            System.out.println("Enter student last name:");
            this.lastName = in.nextLine();

            System.out.println("Choose number corresponding to student level\n1- Freshman\n2 - Sophomore\n3 - Junior\n4- Senior");
            this.gradeYear = in.nextInt();
        }

        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId );

        
    }


    // generate an id
     // each student should have a unique 5 digit id with the first number being their grade level
    //  private class so that it is not accessible to the outside
    private void setStudentId() {
        // student id will be grade level + static id
        Student.id++;
        this.studentId =  this.gradeYear + "" + Student.id; //adding quotes means this.id will be treated as a string and concatenate instead of adding **using Student.id and not this.id to access static property**

    }

    // enroll in courses

    // view balance

    // pay tuition

    // show status
}
