package org.anagram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
    private final String word;
    private final Set<String> wordCombinations;
    private final Set<String> dictionaryWords;

    public Anagram(String word, Set<String> dictionaryWords) {
        this.word = word;
        String sortedWord = sortWord(word);
        this.dictionaryWords = dictionaryWords;
        this.wordCombinations = findWordCombinations(word);
        filterOutNonWords();
    }

    public Set<String> getAnagrams() {
        return wordCombinations;
    }

    public boolean isAnagram(String wordToCompare) {
        return sortWord(word).equals(sortWord(wordToCompare));
    }

    private Set<String> findWordCombinations(String wordCombination) {
        Set<String> combinations = new TreeSet<>();

        if (wordCombination.length() == 1) {
            combinations.add(wordCombination);
        } else {
            //Take each letter and combine with all other letters
            for (int i = 0; i < wordCombination.length(); i++) {
                String removeLetter = wordCombination.substring(0, i);
                String newWord = wordCombination.substring(i + 1);
                String remaining = removeLetter + newWord;

                //Recursive
                for (String permutation : findWordCombinations(remaining)) {
                    String wordCombo = wordCombination.charAt(i) + permutation;

                    combinations.add(wordCombo);
                }
            }
        }

        return combinations;
    }

    private String sortWord(String wordToSort) {
        char[] wordArray = wordToSort.toCharArray();

        Arrays.sort(wordArray);

        return Arrays.toString(wordArray);
    }

    private void filterOutNonWords() {
        Iterator<String> iterator = wordCombinations.iterator();

        while(iterator.hasNext()) {
            if(!dictionaryWords.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
