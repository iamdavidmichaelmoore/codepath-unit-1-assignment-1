package com.dmclabs.queues;

import java.util.*;
import java.util.stream.Collectors;

public class FindKMostFrequentWords {

    private HashMap<String,Integer> map;
    private String[] words;

    public FindKMostFrequentWords(String[] words) {
        this.words = words;
        map = new HashMap<>();
    }

    public void countWords() {
        for (int i = 0; i < words.length; i++) {
            map.merge(words[i],1,(oldValue,newValue) -> oldValue + newValue);
        }

        List<Map.Entry<String, Integer>> sortedEntries = map.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue())
            .collect(Collectors.toList());
        System.out.println(
            "K-most Word: " + sortedEntries.get(sortedEntries.size() - 1).getKey() + "\n" +
            "Count: " + sortedEntries.get(sortedEntries.size() - 1).getValue()
        );
    }
}
