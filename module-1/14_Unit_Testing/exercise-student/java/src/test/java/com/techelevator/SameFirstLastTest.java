package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void isItTheSame_returns_true_if_first_and_last_are_equal(){
        SameFirstLast sut = new SameFirstLast();
        boolean nums = sut.isItTheSame(new int[]{1, 2, 3, 1});

        //Assert
        Assert.assertTrue(nums);
    }

    @Test
    public void isItTheSame_returns_false_if_first_and_last_areNot_equal(){
        SameFirstLast sut = new SameFirstLast();
        boolean nums = sut.isItTheSame(new int[]{1, 2, 3});

        //Assert
        Assert.assertFalse(nums);
    }
}
