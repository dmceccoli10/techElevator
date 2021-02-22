package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FlowerShopOrderTest {
    @Test
    public void test_subtotal_no_roses() {
        FlowerShopOrder myOrder = new FlowerShopOrder("stuff", 0);
        BigDecimal expected = new BigDecimal("19.99");
        Assert.assertEquals(expected, myOrder.getSubtotal());
        //Assert.assertTrue(expected.equals(myOrder.getSubtotal()));
    }

    @Test
    public void test_subtotal_some_roses() {
        FlowerShopOrder myOrder = new FlowerShopOrder("stuff", 4);
        BigDecimal expected = new BigDecimal("31.95");
        Assert.assertEquals(expected, myOrder.getSubtotal());
        //Assert.assertTrue(expected.equals(myOrder.getSubtotal()));
    }

    @Test
    public void test_zip_starts_with_1() {
        FlowerShopOrder myOrder = new FlowerShopOrder("stuff", 4);
        BigDecimal actual = myOrder.calcDeliveryTotal(false, "10000");
        Assert.assertEquals(BigDecimal.ZERO, actual);
    }

    //There should be more tests for the calcDelivery but for the sake of time..

}
