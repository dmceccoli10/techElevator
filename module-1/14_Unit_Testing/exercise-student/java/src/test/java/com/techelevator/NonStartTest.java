package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void getPartialString_with_first_letter_capitals() {
       NonStart sut = new NonStart();
       String partialString = sut.getPartialString("Hello", "There");

       //Assert
        Assert.assertEquals("ellohere", partialString);
    }

    @Test
    public void getPartialString_with_first_letter_lowercase() {
        NonStart sut = new NonStart();
        String partialString = sut.getPartialString("java", "code");

        //Assert
        Assert.assertEquals("avaode", partialString);
    }

    @Test
    public void getPartialString_with_misspelling() {
        NonStart sut = new NonStart();
        String partialString = sut.getPartialString("shotl", "java");

        //Assert
        Assert.assertEquals("hotlava", partialString);
    }

    @Test
    public void getPartialString_with_first_string_length_of_one() {
        NonStart sut = new NonStart();
        String partialString = sut.getPartialString("", "java");

        //Assert
        Assert.assertEquals("ava", partialString);
    }

    @Test
    public void getPartialString_with_second_string_length_of_one() {
        NonStart sut = new NonStart();
        String partialString = sut.getPartialString("java", "");

        //Assert
        Assert.assertEquals("ava", partialString);
    }

    @Test
    public void getPartialString_with_both_strings_one_letter() {
        NonStart sut = new NonStart();
        String partialString = sut.getPartialString("a", "b");

        //Assert
        Assert.assertEquals("", partialString);
    }
}
