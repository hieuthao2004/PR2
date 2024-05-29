package LectureTestArea;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("LectureTestArea/filedata.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        final int NUMBER = 5;
        dos.writeInt(NUMBER);
        for (int i = 0; i < NUMBER; i++) {
            dos.writeInt(i);
        }
        dos.writeUTF("Hello Thu Huyền");
        dos.writeDouble(100.75);
        dos.flush();
        dos.close();
    }
}
