package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void isLessThanMultipleOf20_returns_true_if_n_is_one_less_than_multiple_of_20() {
        //Arrange
        Less20 sut = new Less20();
        //Act
        boolean value = sut.isLessThanMultipleOf20(19);
        //Assert
        Assert.assertTrue(value);
    }

    @Test
    public void isLessThanMultipleOf20_returns_true_if_n_is_two_less_than_multiple_of_20() {
        //Arrange
        Less20 sut = new Less20();
        //Act
        boolean value = sut.isLessThanMultipleOf20(38);
        //Assert
        Assert.assertTrue(value);
    }

    @Test
    public void isLessThanMultipleOf20_returns_false_if_n_is_equal_to_a_multiple_of_20() {
        //Arrange
        Less20 sut = new Less20();
        //Act
        boolean value = sut.isLessThanMultipleOf20(60);
        //Assert
        Assert.assertFalse(value);
    }

    @Test
    public void isLessThanMultipleOf20_returns_false_if_n_is_literally_anything_else() {
        //Arrange
        Less20 sut = new Less20();
        //Act
        boolean value = sut.isLessThanMultipleOf20(26);
        //Assert
        Assert.assertFalse(value);
    }


}
