import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class DictionaryTest {
    public Set<String> words = new TreeSet<>();

    @Test
    public void isWordShouldReturnTrue() throws IOException {
        words.add("car");
        Dictionary dictionary = new Dictionary(words);
        String word = "car";

        Assert.assertTrue(dictionary.isInDictionary(word));
    }

    @Test
    public void isWordShouldReturnFalse() throws IOException {
        words.add("cab");
        Dictionary dictionary = new Dictionary(words);
        String word = "abc";

        Assert.assertFalse(dictionary.isInDictionary(word));
    }

}