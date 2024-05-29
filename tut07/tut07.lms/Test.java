import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws Exception {
        ArrayList<String> enrolledCourses1 = new ArrayList<>();
        ArrayList<String> enrolledCourses2 = new ArrayList<>();
        HashMap<String, Double> list1 = new HashMap<>();
        HashMap<String, Double> list2 = new HashMap<>();

        Student s1 = new Student(2930, "Nguyen Thu Huyen", "23/01/2004", 7.0, enrolledCourses1);
        Student s2 = new Student(2931, "Nguyen Trong Hieu", "13/07/2004", 7.5, enrolledCourses2);
        Course c1 = new Course(20241, "Information Technology", "Hard subject", 3, list1);
        Course c2 = new Course(20242, "Human Resources Management", "Another hard subject", 3, list2);

        s1.addCourse(c1.getNameCourse());
        s2.addCourse(c2.getNameCourse());

        s1.updateGpa(8);
        s2.updateGpa(9.0);
        System.out.println(s1);
        System.out.println(s2);

        c1.addAcademicTranscipt(s1.getName(), s1.getGpa());
        c1.addAcademicTranscipt(s2.getName(), s2.getGpa());
        c2.addAcademicTranscipt(s1.getName(), s1.getGpa());
        System.out.println(c1);
        System.out.println(c2);

    }
}
