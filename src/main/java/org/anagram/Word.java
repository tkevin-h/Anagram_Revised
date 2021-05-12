package org.anagram;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Word {
    private final String word;
    private final Set<String> wordCombinations;

    public Word(String word) {
        this.word = word;
        String sortedWord = sortWord(word);
        this.wordCombinations = findWordCombinations(word);
    }

    public Set<String> getAnagrams() {
        return wordCombinations;
    }

    public boolean isAnagram(String wordToCompare) {
        return sortWord(word).equals(sortWord(wordToCompare));
    }

    private Set<String> findWordCombinations(String wordCombination) {
        Set<String> combinations = new TreeSet<>();

        if(wordCombination.length() == 1){
            combinations.add(word);
        }
        else {
            //Take each letter and combine with all other letters
            for(int i = 0; i < wordCombination.length(); i++) {
                String removeLetter = wordCombination.substring(0, i);
                String newWord = wordCombination.substring(i + 1);
                String remaining  = removeLetter+newWord;

                //Recursive
                for(String permutation : findWordCombinations(remaining)) {
                    String wordCombo = wordCombination.charAt(i) + permutation;

                    //why is this still adding words that have less characters than the original word?
                    if (wordCombo.length() == wordCombination.length()) {
                        combinations.add(wordCombination.charAt(i) + permutation);
                        System.out.println(wordCombination.charAt(i) + permutation);
                    }
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
}
