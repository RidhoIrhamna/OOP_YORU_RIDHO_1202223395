import java.util.ArrayList;
class Student extends User {
    protected ArrayList<String> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetails() {
        StringBuilder details = new StringBuilder("\nStudent - Name: " + name + ", ID: " + id + "\nEnrolled Courses:\n");
        for (String course : enrolledCourses) {
            details.append("- ").append(course).append("\n");
        }
        return details.toString();
    }
}