package com.techelevator;

public class FlowerShopOrder {

    private String bouquetType;
    private Integer numberOfRoses;
    private double subtotal;
    private String zipCode;
    boolean sameDayDelivery;
    private double deliveryTotal;

    private double standardBouquet = 19.99;
    private double additionalRose = 2.99;

    //Constructor
    public FlowerShopOrder(String bouquetType, Integer numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
    }

    public FlowerShopOrder() {

    }


    //getters & setters
    public String getBouquetType() {
        return bouquetType;
    }

    public void setBouquetType(String bouquetType) {
        this.bouquetType = bouquetType;
    }

    public Integer getNumberOfRoses() {
        return numberOfRoses;
    }

    public void setNumberOfRoses() {
        this.numberOfRoses = numberOfRoses;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public boolean isSameDayDelivery() {
        return sameDayDelivery;
    }

    public String getZipCode() {
        return zipCode;
    }

    public double getDeliveryTotal() {
        return deliveryTotal;
    }

    //Method
   // public void calculateDeliveryTotal() {
   //     if ((zipCode >= 20000 && zipCode <= 29999) && !sameDayDelivery) {
   //         deliveryTotal = 3.99;
   //     } else if (zipCode >= 20000 && zipCode < 29999) {
   //         deliveryTotal = 3.99 + 5.99;
   //     } else if (zipCode >= 30000 )
   // }


}
