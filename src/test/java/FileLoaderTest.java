import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class FileLoaderTest {
    public Set<String> words = new TreeSet<>();

    @Test
    public void loadFileShouldReturnAllWords() {
        words.add("car");
        words.add("bus");
        words.add("house");
        words.add("plant");

        FileLoader fileLoader = new FileLoader();

        assertEquals(words, fileLoader.loadTextFile("src/test/resources/TestDictionary.txt"));
    }
}