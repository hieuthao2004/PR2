import java.io.*;

public class IOFile {
    private String filename;

    public IOFile(String filename) {
        this.filename = filename;
    }


    public int countLines() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            reader.close();
            return lineCount;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void write(OutputStream os) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            fis.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copy(String targetFilename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            FileOutputStream fos = new FileOutputStream(targetFilename);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        File file = new File(filename);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Unable to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static void main(String[] args) {
        IOFile ioFile = new IOFile("sample.txt");
        System.out.println("Number of lines: " + ioFile.countLines());
        ioFile.print();
        ioFile.copy("copy.txt");
        ioFile.delete();
    }
}
