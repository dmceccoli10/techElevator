package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void getATable_returns_2_if_you_and_date_are_both_above_8() {
        //Arrange
        DateFashion sut = new DateFashion();
        int score = sut.getATable(8, 8);

        Assert.assertEquals(2, score);
    }

    @Test
    public void getATable_returns_0_if_either_you_or_date_is_2_or_less() {
        //Arrange
        DateFashion sut = new DateFashion();
        int score = sut.getATable(2, 8);

        Assert.assertEquals(0, score);
    }

    @Test
    public void getATable_returns_1_if_both_you_and_date_is_between_3_and_7() {
        //Arrange
        DateFashion sut = new DateFashion();
        int score = sut.getATable(5, 7);

        Assert.assertEquals(1, score);
    }
}
