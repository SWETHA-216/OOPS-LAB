import java.io.*;

public class Main17c {
    public static void main(String[] args) throws IOException {
        File input = new File("bigfile.txt");
        FileInputStream fis = new FileInputStream(input);

        int partSize = 1024; // bytes per part (1KB)
        byte[] buffer = new byte[partSize];
        int part = 1;
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) > 0) {
            FileOutputStream fos = new FileOutputStream("part" + part + ".txt");
            fos.write(buffer, 0, bytesRead);
            fos.close();
            System.out.println("Written: part" + part + ".txt");
            part++;
        }

        fis.close();
    }
}
