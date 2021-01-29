package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

    @Test
    public void getHerd_returns_Tower_for_giraffe() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("giraffe");
        //Assert
        Assert.assertEquals("Tower", herd);
    }

    @Test
    public void getHerd_returnsTower_for_Giraffe() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("Giraffe");
        //Assert
        Assert.assertEquals("Tower", herd);
    }

    @Test
    public void getHerd_returnsUnknown_for_emptyString() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("");
        //Assert
        Assert.assertEquals("unknown", herd);
    }

    @Test
    public void getHerd_returnsUnknown_for_giraffes() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("giraffes");
        //Assert
        Assert.assertEquals("unknown", herd);
    }

    @Test
    public void getHerd_returnsUnknown_for_null() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd(null);
        //Assert
        Assert.assertEquals("unknown", herd);
    }

    @Test
    public void getHerd_returnsUnknown_for_animal_not_in_list() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("alpaca");
        //Assert
        Assert.assertEquals("unknown", herd);
    }

    @Test
    public void getHerd_returnsHerd_for_allCaps() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("GIRAFFE");
        //Assert
        Assert.assertEquals("Tower", herd);
    }
}
