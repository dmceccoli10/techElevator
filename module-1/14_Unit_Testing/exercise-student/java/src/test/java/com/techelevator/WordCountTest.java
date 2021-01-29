package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    
    @Test
    public void getCount_words(){
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[]{"ba", "ba", "black", "sheep"});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);

        Assert.assertEquals(expected, words);
    }

    @Test
    public void getCount_words_empty(){
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[]{});
        Map<String, Integer> expected = new HashMap<>();
        Assert.assertEquals(expected, words);

    }
}

