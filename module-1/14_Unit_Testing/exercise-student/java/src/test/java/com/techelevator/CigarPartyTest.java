package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test
    public void haveParty_returns_true_if_correctNumberOfCigars_and_is_weekend() {
        //Arrange & Act
        CigarParty sut = new CigarParty();
        boolean successful = sut.haveParty(50, true);

        //Assert
        Assert.assertTrue(successful);
    }

    @Test
    public void haveParty_returns_false_if_not_enough_cigars_and_is_weekend() {
        //Arrange & Act
        CigarParty sut = new CigarParty();
        boolean successful = sut.haveParty(20, true);

        //Assert
        Assert.assertFalse(successful);
    }

    @Test
    public void haveParty_returns_false_if_tooManyCigars_and_not_weekend() {
        //Arrange & Act
        CigarParty sut = new CigarParty();
        boolean successful = sut.haveParty(75, false);

        //Assert
        Assert.assertFalse(successful);
    }

    @Test
    public void haveParty_returns_false_if_tooFewCigars_and_not_weekend() {
        //Arrange & Act
        CigarParty sut = new CigarParty();
        boolean successful = sut.haveParty(20, false);

        //Assert
        Assert.assertFalse(successful);
    }

    @Test
    public void haveParty_returns_true_if_correctNumberOfCigars_and_is_notWeekend() {
        //Arrange & Act
        CigarParty sut = new CigarParty();
        boolean successful = sut.haveParty(50, false);

        //Assert
        Assert.assertTrue(successful);
    }
}

