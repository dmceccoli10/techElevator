package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

    @Test
    public void makeArray_last_element_biggest_and_set_all_to_that_value() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int [] {1, 2, 3});

        //Assert
        Assert.assertArrayEquals(new int[] {3, 3, 3}, nums);
    }

    @Test
    public void makeArray_first_element_biggest_and_set_all_to_that_value() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int [] {11, 5, 9});

        //Assert
        Assert.assertArrayEquals(new int[] {11, 11, 11}, nums);
    }

    @Test
    public void makeArray_middle_element_biggest_and_set_all_to_biggest_value_of_first_and_third() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int [] {2, 11, 3});

        //Assert
        Assert.assertArrayEquals(new int[] {3, 3, 3}, nums);
    }

}
