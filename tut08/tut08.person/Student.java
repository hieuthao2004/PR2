import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Student {
    private int studentID;
    private String name ;
    private String dateOfBirth;
    private double gpa = 0.0;
    private ArrayList<String> enrolledCourses = new ArrayList<>();

    public Student(int studentID, String name, String dateOfBirth, double gpa) throws Exception {
        if (!isValidName(name)) {
            throw new Exception("Invalid name");
        }
        if (!isValidDateOfBirth(dateOfBirth)) {
            throw new Exception("Invalid date of birth format");
        }

        if (!isValidGpa()) {
            throw new Exception("Invalid GPA");
        }

        this.studentID = studentID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {
        if (!name.equals("null")) {
            this.name = name;
        }
        throw new Exception("Unwanted name, enter agian");
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    
    public String toString() {
        return getName() + " " + getStudentID() + " " + getDateOfBirth() + " " + getGpa() + " " + getEnrolledCourses();
    }

    //Data Validation
    public boolean isValidName(String name) {
        String regex = "[a-zA-Z\s]+";
        if (name.trim().matches(regex)) {
            return true;
        } else if ((name == null) || (name.trim() == "") || (name.trim() == " ")) {
            return false;
        }
         else {
            return false;
        }
    }

    public boolean isValidGpa() {
        if ((gpa >= 0) || (gpa <= 4)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidDateOfBirth(String dateOfBirth) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateOfBirth);
            return true;
        } catch (Exception e) {
            System.out.println("error parsing date: " + e.getMessage());
            return false;
        }
    }
    //function
    public void addCourse(String courseName) {
        enrolledCourses.add(courseName);
    }

    public double updateGpa(double point) {
        this.gpa = (this.gpa + point)/2;
        return this.gpa; 
    }
}