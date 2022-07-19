package ru.netology.radioman;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    private int maxVolume = 100;

    private int minVolume = 0;
    private int currentVolume = minVolume;

    private int countRadioStation = 10;

    public Radio(int countRadioStation) {
        this.maxRadioStation = countRadioStation - 1;
    }

    public Radio() {
        this.countRadioStation = countRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void setNextRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void setIncreaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void setReduceVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }
}