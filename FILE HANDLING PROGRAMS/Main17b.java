import java.io.*;
import java.util.*;

public class Main17b {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        Map<String, Integer> wordMap = new HashMap<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");
            for (String word : words) {
                if (!word.isEmpty())
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        br.close();

        wordMap.entrySet().stream()
               .sorted((a, b) -> b.getValue() - a.getValue())
               .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
