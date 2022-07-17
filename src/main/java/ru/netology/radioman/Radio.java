package ru.netology.radioman;

public class Radio {
    private int currentNumberAuditionedRadioStation;
    private int currentVolume;
    private int maxNumberAuditionedRadioStation = 9;

    private int minNumberAuditionedRadioStation = 0;

    private int maxVolume = 10;

    private int minVolume = 0;

    public int getNumberAuditionedRadioStation() {
        return currentNumberAuditionedRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumberAuditionedRadioStation(int newCurrentNumberAuditionedRadioStation) {
        currentNumberAuditionedRadioStation = newCurrentNumberAuditionedRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setNextRadioStation(int newCurrentNumberAuditionedRadioStation) {
        if (newCurrentNumberAuditionedRadioStation > maxNumberAuditionedRadioStation) {
            currentNumberAuditionedRadioStation = minNumberAuditionedRadioStation;
        }
        if (newCurrentNumberAuditionedRadioStation < maxNumberAuditionedRadioStation) {
            currentNumberAuditionedRadioStation = newCurrentNumberAuditionedRadioStation + 1;
        }
    }

    public void setPrevRadioStation(int prevRadioStation) {
        if (prevRadioStation < minNumberAuditionedRadioStation) {
            currentNumberAuditionedRadioStation = maxNumberAuditionedRadioStation;
        }
        if (prevRadioStation > minNumberAuditionedRadioStation) {
            currentNumberAuditionedRadioStation = prevRadioStation - 1;
        }
    }

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (newCurrentVolume < maxVolume) {
            currentVolume = newCurrentVolume + 1;
        }
    }

    public void setReduceVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (newCurrentVolume > minVolume) {
            currentVolume = newCurrentVolume - 1;
        }
    }
}



