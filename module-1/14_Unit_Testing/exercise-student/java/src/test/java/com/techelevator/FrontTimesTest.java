package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void generateString_returns_whatever_is_there_if_length_is_less_than_3(){
        //Arrange
        FrontTimes sut = new FrontTimes();
        //Act
        String result = sut.generateString("Ch", 5);
        //Assert
        Assert.assertEquals("ChChChChCh", result);
    }

    @Test
    public void generateString_returns_n_copies_of_String_if_length_greater_than_3(){
        //Arrange
        FrontTimes sut = new FrontTimes();
        //Act
        String result = sut.generateString("Choco", 5);
        //Assert
        Assert.assertEquals("ChoChoChoChoCho",  result);
    }


    @Test
    public void generateString_returns_null_if_String_result_is_null(){
        //Arrange
        FrontTimes sut = new FrontTimes();
        //Act
        String result = sut.generateString("", 3);
        //Assert
        Assert.assertEquals("", result);
    }
}
