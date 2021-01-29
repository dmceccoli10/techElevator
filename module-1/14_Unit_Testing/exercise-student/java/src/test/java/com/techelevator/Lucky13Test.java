package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void getLucky_returns_true_if_no_1s_or_3s() {
        Lucky13 sut = new Lucky13();
        int[] nums = new int[]{0, 2, 4};
        boolean noOnesOrThrees = sut.getLucky(nums);

        Assert.assertTrue(noOnesOrThrees);
    }

    @Test
    public void getLucky_returns_false_if_contains_1s_and_3s() {
        Lucky13 sut = new Lucky13();
        int[] nums = new int[]{1, 2, 3};
        boolean noOnesOrThrees = sut.getLucky(nums);

        Assert.assertFalse(noOnesOrThrees);
    }

    @Test
    public void getLucky_returns_false_if_contains_1s_or_3s() {
        Lucky13 sut = new Lucky13();
        int[] nums = new int[]{1, 2, 4};
        boolean noOnesOrThrees = sut.getLucky(nums);

        Assert.assertFalse(noOnesOrThrees);
    }

}
