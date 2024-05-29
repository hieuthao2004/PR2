package LectureTestArea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ExampleReadObject {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("LectureTestArea/stocks.dat");
            ois = new ObjectInputStream(fis);
            Stock[] stocks = (Stock[]) ois.readObject();
            System.out.println("Read from line: ");
            for (Stock s : stocks) {
                System.out.println(s);
            }
            ois.close();
            fis.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
}
