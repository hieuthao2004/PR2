import java.util.ArrayList;
import java.util.List;

public class XFileDemo {
    public static void main(String[] args) {
        // byte[] data = XFile.read("text.txt");
        // XFile.write("text1.txt", data);

        List<Student> list = new ArrayList<>();
        list.add(new Student("Hieu", 9, Department.FIT));
        list.add(new Student("Tuan", 9.5, Department.ENG));

        XFile.writeObject("students.dat", list);

        

    }
}
