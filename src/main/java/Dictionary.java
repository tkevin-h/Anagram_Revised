import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class Dictionary {
    private final Set<String> words = new TreeSet<>();

    public Dictionary(String filePath) {
        buildDictionary(filePath);
    }

    private void buildDictionary(String filePath) {
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
    }

    public boolean isWord(String word) {
        return words.contains(word);
    }
}
