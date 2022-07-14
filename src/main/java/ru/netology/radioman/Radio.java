package ru.netology.radioman;

public class Radio {
    public int currentNumberAuditionedRadioStation;
    public int currentVolume;

    public int getNumberAuditionedRadioStation() {
        return currentNumberAuditionedRadioStation;
    }

    public void next(int newNumberRadioStation) {
        if (newNumberRadioStation > 9)
            currentNumberAuditionedRadioStation = 0;

        if (newNumberRadioStation <= 9)
            currentNumberAuditionedRadioStation = newNumberRadioStation;

    }

    public void prev(int newNumberRadioStation) {
        if (newNumberRadioStation < 0)
            currentNumberAuditionedRadioStation = 9;

        if (newNumberRadioStation >= 0)
            currentNumberAuditionedRadioStation = newNumberRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10)
            currentVolume = 10;

        if (newCurrentVolume <= 10)
            currentVolume = newCurrentVolume;
    }

    public void reduceVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0)
            currentVolume = 0;

        if (newCurrentVolume >= 0)
            currentVolume = newCurrentVolume;
    }
}
