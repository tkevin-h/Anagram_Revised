package org.anagram;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class DictionaryTest {
    public final Set<String> words = new TreeSet<>();
    public final Set<String> dictionaryWords = new TreeSet<>();

    @Test
    public void isWordShouldReturnTrue(){
        words.add("car");
        dictionaryWords.add("car");
        dictionaryWords.add("rac");

        Dictionary dictionary = new Dictionary(words, dictionaryWords);
        String word = "car";

        Assert.assertTrue(dictionary.isInDictionary(word));
    }

    @Test
    public void isWordShouldReturnFalse(){
        words.add("cab");
        dictionaryWords.add("car");
        dictionaryWords.add("rac");

        Dictionary dictionary = new Dictionary(words, dictionaryWords);
        String word = "abc";

        Assert.assertFalse(dictionary.isInDictionary(word));
    }
}