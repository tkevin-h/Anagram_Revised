import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class FileLoader {
    private final Set<String> words = new TreeSet<>();

    public Set<String> loadTextFile(String filePath) {
        try {
            BufferedReader dictionary = new BufferedReader(new FileReader(filePath));

            String word;

            while ((word = dictionary.readLine()) != null) {
                words.add(word);
            }
            dictionary.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        return words;
    }
}
