package org.anagram;

import java.util.List;
import java.util.Set;

public interface InputOutput {
    String getOptions();

    List<String> inputForIsAnagram();
    void outputForIsAnagram(boolean isAnagram);

    String inputForFindAnagram();
    void outputForFindAnagram(Set<String> anagrams);
}
