package LectureTestArea;

import java.io.FileWriter;
import java.io.IOException;

//Write to file
public class AreaTest1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("LectureTestArea/output.txt");
            writer.write("Xin chao Thu Huyen"); 
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
