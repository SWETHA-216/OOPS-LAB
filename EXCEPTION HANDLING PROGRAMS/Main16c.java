import java.io.*;

class FileSizeTooLargeException extends Exception {
    public FileSizeTooLargeException(String msg) {
        super(msg);
    }
}

public class Main16c {

    static void checkFileSize(String filePath) throws IOException, FileSizeTooLargeException {
        File file = new File(filePath);
        if (!file.exists()) throw new FileNotFoundException("File not found.");
        if (file.length() > 500) {
            throw new FileSizeTooLargeException("File size exceeds limit (500 bytes).");
        }
        System.out.println("File is safe to open. Size: " + file.length() + " bytes.");
    }

    public static void main(String[] args) {
        try {
            checkFileSize("test.txt");  // Use a real file for testing
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (FileSizeTooLargeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
