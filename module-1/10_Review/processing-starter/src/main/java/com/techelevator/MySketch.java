package com.techelevator;

import processing.core.PApplet;

public class MySketch extends PApplet {

    @Override
    public void settings() {
        size(1040, 780);
    }

    @Override
    public void setup() {
        background(0, 0, 250);
    }

    @Override
    public void draw() {
        fill(random(255));
        //circle(random(width), random(height), 20);
        circle(mouseX, mouseY, 50);
    }

}
