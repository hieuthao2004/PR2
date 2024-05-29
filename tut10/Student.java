import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private double mark;
    private Department faculty;

    public Student(String name, double mark, Department faculty) {
        this.name  = name;
        this.mark = mark;
        this.faculty= faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Department getFaculty() {
        return faculty;
    }

    public void setFaculty(Department faculty) {
        this.faculty = faculty;
    }
}
