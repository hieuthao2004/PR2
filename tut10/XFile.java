import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {
    public static byte[] read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject();
            ois.close();
            return object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObject(String path, Object object) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException(e);
        }
    }

}
