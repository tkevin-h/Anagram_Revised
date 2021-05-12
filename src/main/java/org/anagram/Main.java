package org.anagram;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Loader fileLoader = new TxtLoader("src/main/resources/dictionary.txt");
        Scanner input = new Scanner(System.in);

        String userWordOne;
        String userWordTwo;
        String optionSelect;
        String anagramResult;
        Set<String> allAnagramsResult;

        System.out.println("Enter a word");
        userWordOne = input.nextLine().toLowerCase();

        System.out.println("1. Check if " + userWordOne + " is an Anagram of another word");
        System.out.println("2. Find all anagrams of " + userWordOne);
        optionSelect = input.nextLine().toLowerCase();

        switch (optionSelect) {
            case "1":
                System.out.println("Enter another word");
                userWordTwo = input.nextLine().toLowerCase();
                anagramResult = m.runAnagramCheck(userWordOne, userWordTwo);
                System.out.println(anagramResult);
            case "2":
                allAnagramsResult = m.runGetAllAnagrams(userWordOne, fileLoader.load());
                System.out.println(allAnagramsResult);
            default:
                System.out.println("Invalid selection");
        }
    }

    public String runAnagramCheck(String wordOne, String wordTwo) {
        Word word = new Word(wordOne);

        if(word.isAnagram(wordTwo)) {
            return "These words are anagrams";
        }

        return "These words are not anagrams";
    }

    public Set<String> runGetAllAnagrams(String wordOne, Set<String> words) {
        Word word = new Word(wordOne);

        return word.getAnagrams();
    }

    /*public void run(Loader loader) {
        Scanner input = new Scanner(System.in);
        String userWordOne;
        String userWordTwo;
        String optionSelect;

        Dictionary dictionary = new Dictionary(loader.load());

        System.out.println("Enter a word");
        userWordOne = input.nextLine().toLowerCase();

        Word word = new Word(userWordOne);

        System.out.println("1. Check if " + userWordOne + " is an Anagram of another word");
        System.out.println("2. Find all anagrams of " + userWordOne);
        optionSelect = input.nextLine().toLowerCase();

        switch (optionSelect) {
            case "1":
                System.out.println("Enter another word");
                userWordTwo = input.nextLine().toLowerCase();
                if (word.isAnagram(userWordTwo)) {
                    System.out.println("These words are anagrams");
                } else {
                    System.out.println("These words are not anagrams");
                }
            case "2":
                System.out.println(word.getAnagrams());
            default:
                System.out.println("Invalid selection");
        }
    }*/
}
