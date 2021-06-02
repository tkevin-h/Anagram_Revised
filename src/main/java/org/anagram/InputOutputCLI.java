package org.anagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class InputOutputCLI implements InputOutput {
    Scanner input = new Scanner(System.in);

    public String getOptions() {
        String optionSelect;

        System.out.println("1. Check if two words are anagrams of each other");
        System.out.println("2. Find all anagrams of a word");

        optionSelect = input.nextLine().toLowerCase();

        switch (optionSelect) {
            case "1":
                return "checkAnagrams";
            case "2":
                return "findAnagrams";
            default:
                return "Invalid selection";
        }
    }

    public List<String> inputForIsAnagram() {
        List<String> words = new ArrayList<>();
        String userWordOne;
        String userWordTwo;

        System.out.println("Enter first word");
        words.add(input.nextLine().toLowerCase());
        System.out.println("Enter second word");
        words.add(input.nextLine().toLowerCase());
        return words;
    }

    public void outputForIsAnagram(boolean isAnagram) {
        if (isAnagram) {
            System.out.println("These words are anagrams");
        } else {
            System.out.println("These words are not anagrams");
        }
    }

    public String inputForFindAnagram() {
        System.out.println("Enter a word");
        return input.nextLine().toLowerCase();
    }

    public void outputForFindAnagram(Set<String> anagrams) {
        System.out.println("Anagrams: " + anagrams);
    }
}
