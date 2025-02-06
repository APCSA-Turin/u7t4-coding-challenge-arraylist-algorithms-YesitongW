package com.example.project;

import java.util.*;

public class Test{
    public static void main(String[] args) {
        String sentence = "This is a random sentence!";
        System.out.println(parseSentence(sentence));
    }

    public static ArrayList<String> parseSentence(String sentence){
        ArrayList<String> parsedSentence = new ArrayList<>();
        String currentWord = "";
        for (int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);

            if(c != ' '){
                currentWord += c;
            } else {
                parsedSentence.add(currentWord);
                currentWord = "";
            }
        }

        parsedSentence.add(currentWord);
        return parsedSentence;
    }
}

