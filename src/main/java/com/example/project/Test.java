package com.example.project;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Hello");
        word.add("World");
        word.add("Hi");

        ArrayList<String> result = duplicateUpperEnd(word);
        System.out.println(result);
    }

    public static ArrayList<String> duplicateUpperEnd(ArrayList<String> wordList) {
        int initialSize = wordList.size();
        for (int i = 0; i < initialSize; i++) {
            String uppercase = wordList.get(i).toUpperCase();
            wordList.add(uppercase);
        }
        return wordList;
    }
}


