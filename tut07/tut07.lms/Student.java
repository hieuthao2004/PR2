import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Student {
    private int studentID;
    private String name;
    private String dateOfBirth;
    private double gpa = 0.0;
    private ArrayList<String> enrolledCourses = new ArrayList<>();

    public Student(int studentID, String name, String dateOfBirth, double gpa, ArrayList<String> enrolledCourses ) throws Exception {
        if (studentID <= 0) {
            throw new Exception("Invalid ID");
        }
        if (inValidName(name)) {
            throw new Exception("Invalid name");
        } 
        if (!validGpa()) {
            throw new Exception("Invalid GPA");
        }

        if (!validDateOfBirth(dateOfBirth)) {
            throw new Exception("Invalid DOB");
        }

        
        this.studentID = studentID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
        this.enrolledCourses = enrolledCourses;
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
        // TODO Auto-generated method stub
        return getName() + " " + getStudentID() + " " + getDateOfBirth() + " " + getGpa() + " " + getEnrolledCourses();
    }

    // Validation
    public boolean inValidName(String name) {
        //Nguyen Trong Hieu
        if ((name == null)) {
            return true;
        } 
        return false;
    }

    public boolean validGpa() {
        if ((gpa >= 0) || (gpa <= 10)) {
            return true;
        }
        return false;
    }

    public boolean validDateOfBirth(String dateOfBirth) throws Exception {
        DateFormat dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateOfBirth);
            return true;
        } catch (Exception e) {
            System.out.println("Error parsing date! " + e.getMessage());
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