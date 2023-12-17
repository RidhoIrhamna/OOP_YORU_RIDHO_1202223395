import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input student name
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            // Input student ID with error handling
            int studentId = getValidStudentID(scanner);

            // Input courses to enroll in
            System.out.print("Enter courses to enroll in (separated by commas): ");
            String coursesInput = scanner.nextLine();
            String[] coursesArray = coursesInput.split(", ");

            // Create student object
            Student student = new Student(studentName, studentId);

            // Enroll student in courses
            for (String course : coursesArray) {
                student.enrollInCourse(course);
            }

            // Display user details
            System.out.println(student.getUserDetails());

            // Display course details
            // System.out.println("\nCourse Details:");
            displayCourseDetails("101", "pbo", "Heri", "Mamat");
            displayCourseDetails("102", "statin", "Winry", "Tuti");

            // Create and display Teacher and Admin details
            Teacher teacher = new Teacher("Pak Didik Kusumo", 201);
            teacher.teachClass("Math");

            Admin admin = new Admin("Hartono", 301);
            admin.manageSystem("the university");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int getValidStudentID(Scanner scanner) {
        while (true) {
            try {
                // Input student ID
                System.out.print("Enter student ID: ");
                int studentId = Integer.parseInt(scanner.nextLine());

                // Check if ID is invalid
                if (String.valueOf(studentId).length() != 10) {
                    System.out.println("Invalid ID. Please enter a valid 10-digit integer for student ID.");
                } else {
                    return studentId;
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for student ID.");
            }
        }
    }

    private static void displayCourseDetails(String courseId, String courseName, String student1, String student2) {
        System.out.println("Course Details:");
        System.out.println("course ID : " + courseId);
        System.out.println("course name: " + courseName);
        System.out.println("- student : " + student1);
        System.out.println("- student : " + student2 + "\n");
    }
}