package org.anagram;

import java.util.Set;

public class Dictionary {
    private final Set<String> words;
    private final Set<String> dictionaryWords;

    public Dictionary(Set<String> combinationWords, Set<String> dictionaryWords) {
        this.words = combinationWords;
        this.dictionaryWords = dictionaryWords;
        filterOutNonWords();
    }

    public boolean isInDictionary(String word) {
        return words.contains(word);
    }

    private void filterOutNonWords() {
        Set<String> dictionary;

        for(String word : words) {
            if (!dictionaryWords.contains(word)) {
                words.remove(word);
            }
        }
    }
}
