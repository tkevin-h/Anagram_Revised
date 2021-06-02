package org.anagram;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class AnagramTest {
    public final Set<String> dictionaryWords = new TreeSet<>();

    @Test
    public void isAnagramShouldReturnTrue() {
        dictionaryWords.add("car");
        Anagram anagram = new Anagram("car", dictionaryWords);
        String word1 = "arc";

        Assert.assertTrue(anagram.isAnagram(word1));
    }

    @Test
    public void isAnagramShouldReturnFalse() {
        dictionaryWords.add("car");
        Anagram anagram = new Anagram("car", dictionaryWords);
        String word1 = "cars";

        Assert.assertFalse(anagram.isAnagram(word1));
    }

    @Test
    public void findAnagramShouldReturnOneAnagram() {
        dictionaryWords.add("arc");
        Anagram anagram = new Anagram("car", dictionaryWords);
        Set<String> words = new TreeSet<>();
        words.add("arc");

        Assert.assertEquals(words, anagram.getAnagrams());
    }

    @Test
    public void findAnagramShouldNotReturnAnagrams() {
        dictionaryWords.add("car");
        Anagram anagram = new Anagram("caw", dictionaryWords);
        Set<String> words = new TreeSet<>();

        Assert.assertEquals(words, anagram.getAnagrams());
    }

}