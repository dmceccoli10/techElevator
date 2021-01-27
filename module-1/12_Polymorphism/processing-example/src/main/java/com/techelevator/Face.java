package com.techelevator;

import processing.core.PApplet;

public class Face {

    private float centerX;
    private float centerY;

    public Face(float centerX, float centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void draw(PApplet sketch) {
        sketch.circle(centerX, centerY, 200);
        sketch.ellipse(centerX - 30, centerY - 40, 20, 40);
        sketch.ellipse(centerX + 30, centerY - 40, 20, 40);
        sketch.curve(centerX - 60, centerY - 130, centerX - 50, centerY + 30, centerX + 50, centerY + 30, centerX + 70, centerY - 130);
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }
}
