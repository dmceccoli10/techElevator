package com.techelevator;

public class Television {
    boolean isOn = false;
    int currentChannel = 3;
    int currentVolume = 2;

    //getters
    public boolean isOn() {
        return isOn;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        isOn = false;
    }
    public void turnOn() {
        isOn = true;
        currentVolume = 2;
        currentChannel = 3;
    }

    public void changeChannel(int newChannel) {
        if (isOn == true && newChannel < 18 && newChannel > 3) {
            currentChannel = newChannel;
        }
    }

    //Channel up
    public void channelUp() {
        if (isOn == true) {
            if (currentChannel == 18) {
                currentChannel = 3;
            } else {
                currentChannel += 1;
            }
        }
    }
    //Channel down
    public void channelDown() {
        if (isOn == true) {
            if (currentChannel == 3) {
                currentChannel = 18;
            } else {
                currentChannel -= 1;
            }
        }
    }
    //Volume up
    public void raiseVolume() {
        if (isOn == true && currentVolume < 10) {
            currentVolume += 1;
        }
    }
    //Volume down
    public void lowerVolume() {
        if (isOn == true && currentVolume > 0) {
            currentVolume -= 1;
        }
    }




}
