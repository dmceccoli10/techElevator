package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test
    public void getBits_returns_alternate_letters_starting_with_first() {
        StringBits sut = new StringBits();
        String demBitties = sut.getBits("Hello");

        Assert.assertEquals("Hlo", demBitties);
    }

    @Test
    public void getBits_returns_alternate_letters_if_empty_string() {
        StringBits sut = new StringBits();
        String demBitties = sut.getBits("");

        Assert.assertEquals("", demBitties);
    }
}
