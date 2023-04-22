import java.util.Scanner;
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = " ";
    private int tuitionBalance = 0; 
    private static int costOfCourse = 600; //static means that this value or property is not specific to an object but rather it is something that is true for all objects; kind of it belongs to the class and not the instance of the object; it is not true for the instace of the class ie the object...it is just true for the class
    private static int id = 1000; //this value will remain with the class and every time a new student is created it will be incremented by one 
    private Scanner in;  //todo => figure out why scanner issues only go a away when i create this property and use different object name for scanner object in enroll method


    // constructor prompts users to enter student name and year
    public Student() {
        
        // in java the try with statement is a try statement that declares one or more resources
        // the resource is as an object that must be closed after finishing the program
        // the try with resources statement ensures that each resource is closed at the end  of the statement execution
        // You can pass any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable.
        
            this.in = new Scanner(System.in);
            System.out.print("Enter student first name: ");
            this.firstName = in.nextLine();

            System.out.print("Enter student last name: ");
            this.lastName = in.nextLine();

            System.out.print("1- Freshman\n2 - Sophomore\n3 - Junior\n4- Senior\nChoose number corresponding to student level: ");
            this.gradeYear = in.nextInt();
        

        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId );

        // this.in.close();
        
    }


    // GENERATE AN ID
    // each student should have a unique 5 digit id with the first number being their grade level
    // private class so that it is not accessible to the outside
    private void setStudentId() {
        // student id will be grade level + static id
        Student.id++;
        this.studentId =  this.gradeYear + "" + Student.id; //adding quotes means this.id will be treated as a string and concatenate instead of adding **using Student.id and not this.id to access static property**

    }

    // ENROLL IN COURSES
    public void enroll() {
        // get inside a loop until user presses Q to quit

        // create a different scanner object for enroll method to avoid using a scanner that has already been closed
        // Scanner input = new Scanner(System.in);
        do {
            
            System.out.print("Enter course to enroll (Q to quit): ");  //look into why this statement is printed twice 
            String course = in.nextLine();
            if(!course.equals("Q")) {
                // using  if(course != "Q") may not work as expected because in java you should not use "==" or "!=" to compare two strings
                // this is because the == and != operators compare object references, not the actual content of the strings.
                // To compare the content of two strings in Java, you should use the equals() method instead. 
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
                // System.out.println("course: " + course);
            } else {
                break;
            }
            
            
           

        } while (1 != 0);
        

        // input.close(); //close scanner outside loop so as to not interfere with getting input from user while still looping
       
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tution balance: " + tuitionBalance);
       
        
    } 
       

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {

            viewBalance();
            System.out.println("How much would you like to pay: ");
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank you for your payment of: " + payment);
            viewBalance();
        
       
       
    }

    // show status
    public String showInfo() {
        // add grade and student id and organize output in console
        return "Name: " + firstName + " " + lastName +
        "\nCourses enrolled: " + courses +
        "\nBalance: " + tuitionBalance;
    }
}
