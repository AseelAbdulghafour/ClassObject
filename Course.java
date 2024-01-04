public class Course {
    String course;
    String instructor;
    int studentenrolled;

    Course(String courseName, String instructorName, int NumberOfStudentEnrolled) {
        course = courseName;
        instructor = instructorName;
        studentenrolled = NumberOfStudentEnrolled;
    }

    public void setcoursName(String courseName) {
        // this. for private elements
        course = courseName;
    }

    public String getCourseName() {
        return course;

    }

    public void setInstructor(String instructorName) {
        // this. for private elements
        instructor = instructorName;
    }

    public String getInstructorName() {
        return instructor;
    }

    public void setStudentenrolled(int NumberOfStudentEnrolled) {
        // this. for private elements
        studentenrolled = NumberOfStudentEnrolled;
    }

    public int getNumberOfStudentEnrolled() {
        return studentenrolled;
    }

    @Override
    public String toString() {
        return " course name: " + course + " instructor name: " + instructor + " students enrolled "
                + studentenrolled;
    }

    public static void main(String[] args) {

        Course java = new Course(" Java ", " Salwa ", 20);
        System.out.println(java);
    }

}