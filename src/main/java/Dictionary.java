import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class Dictionary {
    private Set<String> words = new TreeSet<>();

    public Dictionary(Set<String> dictionaryWords) {
        this.words = dictionaryWords;
    }

    public boolean isInDictionary(String word) {
        return words.contains(word);
    }
}
