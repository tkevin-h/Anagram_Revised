package org.anagram;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TxtLoaderTest {
    public final Set<String> words = new TreeSet<>();

    @Test
    public void loadFileShouldReturnAllWords() {
        words.add("car");
        words.add("bus");
        words.add("house");
        words.add("plant");

        TxtLoader txtLoader = new TxtLoader("src/test/resources/TestDictionary.txt");

        assertEquals(words, txtLoader.load());
    }
}