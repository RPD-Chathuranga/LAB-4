package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Lecturer Name: ");
        String lecturerName = scanner.nextLine();

        System.out.print("Enter Course Taught by Lecturer: ");
        String courseTeaching = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Degree Name: ");
        String degreeName = scanner.nextLine();

        System.out.print("Enter Course Following by Student: ");
        String courseFollowing = scanner.nextLine();

        Lecturer lecturer = new Lecturer(lecturerName, courseTeaching);
        Course course = new Course(courseName, courseCode);
        course.setLecturer(lecturer);
        Student student = new Student(studentName, degreeName, courseFollowing);

        System.out.println("\n--- Registration Details ---");
        System.out.println("Course: " + course.getCourseName() + " (" + course.getCourseCode() + ")");
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Student: " + student.getStudentName() + " (" + student.getDegreeName() + ")");

        scanner.close();
    }
}

class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}