import java.util.HashMap;

public class Course {
    private int courseID;
    private String nameCourse;
    private String description;
    private int credit;
    private HashMap<String, Double> academicTranscipt = new HashMap<>(); //Different from tutorial task

    public Course(int courseID, String nameCourse, String descprition, int credit, HashMap<String, Double> academicTranscript) {
        this.courseID = courseID;
        this.nameCourse = nameCourse;
        this.description =descprition;
        this.credit = credit;
        this.academicTranscipt = academicTranscript;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public HashMap<String, Double> getAcademicTranscipt() {
        return academicTranscipt;
    }

    public void setAcademicTranscipt(HashMap<String, Double> academicTranscipt) {
        this.academicTranscipt = academicTranscipt;
    }

    @Override
    public String toString() {
        return getNameCourse() + " " + getCourseID() + " " + getDescription() + " " + getAcademicTranscipt();
    }
    //function
    public void addAcademicTranscipt(String studentName, double studentPoint) {
        academicTranscipt.put(studentName, studentPoint);
    }
}
