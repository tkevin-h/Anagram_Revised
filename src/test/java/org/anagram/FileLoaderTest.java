package org.anagram;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class FileLoaderTest {
    public final Set<String> words = new TreeSet<>();

    @Test
    public void loadFileShouldReturnAllWords() {
        words.add("car");
        words.add("bus");
        words.add("house");
        words.add("plant");

        FileLoader fileLoader = new FileLoader("src/test/resources/TestDictionary.txt");

        assertEquals(words, fileLoader.load());
    }
}