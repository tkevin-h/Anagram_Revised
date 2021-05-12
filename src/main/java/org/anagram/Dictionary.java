package org.anagram;

import java.util.Set;
import java.util.TreeSet;

public class Dictionary {
    private final Set<String> words;

    public Dictionary(Set<String> dictionaryWords) {
        this.words = dictionaryWords;
    }

    public boolean isInDictionary(String word) {
        return words.contains(word);
    }
}
