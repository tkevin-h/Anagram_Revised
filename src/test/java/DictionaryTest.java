import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class DictionaryTest {

    @Test
    public void isWordShouldReturnTrue() throws IOException {
        Dictionary dictionary = new Dictionary("src/test/resources/dictionary.txt");
        String word = "car";

        Assert.assertTrue(dictionary.isWord(word));
    }

    @Test
    public void isWordShouldReturnFalse() throws IOException {
        Dictionary dictionary = new Dictionary("src/test/resources/dictionary.txt");
        String word = "abc";

        Assert.assertFalse(dictionary.isWord(word));
    }

}