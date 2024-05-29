package LectureTestArea;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExampleWriteObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("LectureTestArea/stocks.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Stock[] stocks = {
            new Stock(1001, "RTX 4090", 500, 50),
            new Stock(1002, "Intel i9 gen 12th", 350, 30)
        };
        oos.writeObject(stocks);
        oos.close();
    }
}

/**
 * Stock
 */
class Stock implements Serializable {
    int id;
    String data;
    double price;
    int number;
    
    public Stock(int id, String data, double price, int number) {
        this.id = id;
        this.data = data;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.id + " " + this.data + " " + this.price + " " + this.number;
    }
}
