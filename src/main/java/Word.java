import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Word {
    private String word;
    private Dictionary dictionary;

    public Word(String word) {
        this.word = word;
        this.dictionary = new Dictionary("./resources/dictionary.txt");
    }

    public boolean isAnagram(String wordToCompare) {
        return sortWord(word).equals(sortWord(wordToCompare));
    }

    public Set<String> findAnagrams() {
        Set<String> combinations = new TreeSet<>();

        return combinations;
    }

    private Set<String> findCombinations(String wordCombination) {
        Set<String> combinations = new TreeSet<>();

        if(word.length() == 1){
            combinations.add(word);
        }
        else {
            //Take each letter and combine with all other letters
            for(int i = 0; i < word.length(); i++) {
                String removeLetter = word.substring(0, i);
                String newWord = word.substring(i + 1);
                String remaining  = removeLetter+newWord;

                //Recursive
                for(String permutation : findCombinations(remaining)) {
                    String wordCombo = word.charAt(i) + permutation;

                    //why is this still adding words that have less characters than the original word?
                    if (wordCombo.length() == word.length()) {
                        combinations.add(word.charAt(i) + permutation);
                        System.out.println(word.charAt(i) + permutation);
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
