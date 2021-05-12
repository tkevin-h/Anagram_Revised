package org.anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class FileLoader implements Loader {

    private final String _filePath;

    public FileLoader(String filePath)
    {
        _filePath = filePath;
    }

    @Override
    public Set<String> load() {
        Set<String> words = new TreeSet<>();
        try {
            BufferedReader dictionary = new BufferedReader(new FileReader(_filePath));

            String word;

            while ((word = dictionary.readLine()) != null) {
                words.add(word);
            }
            dictionary.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        return words;
    }
}
