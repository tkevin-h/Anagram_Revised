package org.anagram;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class DictionaryTest {
    public final Set<String> words = new TreeSet<>();

    @Test
    public void isWordShouldReturnTrue(){
        words.add("car");
        Dictionary dictionary = new Dictionary(words);
        String word = "car";

        Assert.assertTrue(dictionary.isInDictionary(word));
    }

    @Test
    public void isWordShouldReturnFalse(){
        words.add("cab");
        Dictionary dictionary = new Dictionary(words);
        String word = "abc";

        Assert.assertFalse(dictionary.isInDictionary(word));
    }

}