import java.io.*;

public class Main17a {
    public static void main(String[] args) throws IOException {
        File input = new File("original.txt");
        File output = new File("encrypted.txt");

        FileReader fr = new FileReader(input);
        FileWriter fw = new FileWriter(output);

        int key = 3; // Caesar shift key
        int c;

        while ((c = fr.read()) != -1) {
            if (Character.isLetter((char) c)) {
                char base = Character.isUpperCase((char) c) ? 'A' : 'a';
                c = (char) ((c - base + key) % 26 + base);
            }
            fw.write(c);
        }

        fr.close();
        fw.close();
        System.out.println("Encryption done! Output saved in encrypted.txt");
    }
}
