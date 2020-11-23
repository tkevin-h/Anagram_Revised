import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class WordTest {

    @Test
    public void isAnagramShouldReturnTrue() {
        Word word = new Word("car");
        String word1 = "arc";

        Assert.assertTrue(word.isAnagram(word1));
    }

    @Test
    public void isAnagramShouldReturnFalse() {
        Word word = new Word("car");
        String word1 = "cars";

        Assert.assertFalse(word.isAnagram(word1));
    }

    @Test
    public void findAnagramShouldReturnOneAnagram() {
        Word word = new Word("car");
        Set<String> words = new TreeSet<>();
        words.add("arc");

        Assert.assertEquals(words, word.findAnagrams());
    }

    @Test
    public void findAnagramShouldNotReturnAnagrams() {
        Word word = new Word("caw");
        Set<String> words = new TreeSet<>();

        Assert.assertEquals(words, word.findAnagrams());
    }

}