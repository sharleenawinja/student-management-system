public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.enroll();
        student1.payTuition();
        System.out.println(student1.showInfo()); 
        // ask how many users we want to create

        // create n number of students
    }
}