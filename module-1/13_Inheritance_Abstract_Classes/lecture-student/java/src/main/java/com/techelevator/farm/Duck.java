package com.techelevator.farm;

public class Duck extends FarmAnimal {

    public Duck() {
        super("Duck");
    }

    @Override
    public String makeSound() {
        return "quack";
    }

    //@Override
    //public String getName() {
    //    return "Quackers the Duck";
    //}
}
