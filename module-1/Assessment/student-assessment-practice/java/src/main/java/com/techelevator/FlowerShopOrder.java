package com.techelevator;

import java.math.BigDecimal;

public class FlowerShopOrder {

    private String bouquetType;
    private int numberOfRoses;
    private BigDecimal subtotal;


    public String getBouquetType() {
        return bouquetType;
    }

    public int getNumberOfRoses() {
        return numberOfRoses;
    }

    public BigDecimal getSubtotal() {
        subtotal = new BigDecimal("19.99");
        for (int i = 0; i < numberOfRoses; i++) {
            subtotal = subtotal.add(new BigDecimal("2.99"));
        }
        return subtotal;
    }

    public FlowerShopOrder(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
    }

    public BigDecimal calcDeliveryTotal(boolean isSameDay, String zip) {
        BigDecimal deliveryFee = new BigDecimal("0");
        int intZip = Integer.parseInt(zip);
        if (20000 <= intZip && intZip <= 29999) {
            deliveryFee = new BigDecimal("3.99");
            if (isSameDay) {
                deliveryFee = deliveryFee.add(new BigDecimal("5.99"));
            }
        } else if (30000 <= intZip && intZip <= 39999) {
            deliveryFee = new BigDecimal("6.99");
            if (isSameDay) {
                deliveryFee = deliveryFee.add(new BigDecimal("5.99"));
            }
        } else if (10000 <= intZip && intZip <= 19999) {
            deliveryFee = BigDecimal.ZERO;
        } else {
            deliveryFee = new BigDecimal("19.99");
        }
        return deliveryFee;
    }

    @Override
    public String toString() {
        //ORDER - {bouquet type} - {number of roses} roses - {subtotal}
        //have to call getSubtotal because the subtotal is zero until after it's called
        return "ORDER - "+bouquetType+" - "+numberOfRoses+" roses - "+getSubtotal();
    }
}