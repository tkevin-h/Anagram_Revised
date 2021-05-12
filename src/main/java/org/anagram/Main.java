package org.anagram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Loader fileLoader = new FileLoader("src/main/resources/dictionary.txt");

        Main m = new Main();
        m.run(fileLoader);

    }

    public void run(Loader loader) {
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
    }
}
