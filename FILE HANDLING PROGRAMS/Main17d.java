import java.io.*;

public class Main17d {
    public static void main(String[] args) throws IOException {
        String[] fileNames = {"part1.txt", "part2.txt", "part3.txt"};  // Change as needed
        FileWriter fw = new FileWriter("combined.txt");

        for (String name : fileNames) {
            BufferedReader br = new BufferedReader(new FileReader(name));
            String line;
            fw.write("---- Start of " + name + " ----\n");

            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
            }

            fw.write("---- End of " + name + " ----\n\n");
            br.close();
        }

        fw.close();
        System.out.println("Files merged into combined.txt");
    }
}
