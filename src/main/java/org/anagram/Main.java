package org.anagram;

import java.util.List;

public class Main {
    Loader textLoader = new TxtLoader("src/main/resources/dictionary.txt");
    InputOutput inputCLI = new InputOutputCLI();

    public static void main(String[] args) {
        Main anagrams = new Main();
        anagrams.run(anagrams.textLoader, anagrams.inputCLI);
    }

    public void run(Loader data, InputOutput inputOutput) {
        String option = inputOutput.getOptions();

        if (option.equals("checkAnagrams")) {
            List<String> checkAnagramWords = inputOutput.inputForIsAnagram();
            Anagram anagram = new Anagram(checkAnagramWords.get(0), data.load());
            inputOutput.outputForIsAnagram(anagram.isAnagram(checkAnagramWords.get(1)));
        }

        if (option.equals("findAnagrams")) {
            String findAnagramsWord = inputOutput.inputForFindAnagram();
            Anagram anagram = new Anagram(findAnagramsWord, data.load());
            inputOutput.outputForFindAnagram(anagram.getAnagrams());
        }
    }
}
