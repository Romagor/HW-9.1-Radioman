package ru.netology.radioman;

public class Radio {
    private int currentNumberAuditionedRadioStation;
    private int currentVolume;

    public int getNumberAuditionedRadioStation() {
        return currentNumberAuditionedRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxNumberAuditionedRadioStation() {
        currentNumberAuditionedRadioStation = 9;
    }

    public void setMinNumberAuditionedRadioStation() {
        currentNumberAuditionedRadioStation = 0;
    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setCurrentNumberAuditionedRadioStation(int newCurrentNumberAuditionedRadioStation) {
        currentNumberAuditionedRadioStation = newCurrentNumberAuditionedRadioStation;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setNextRadioStation(int nextRadioStation) {
        if (nextRadioStation > 9) {
            setMinNumberAuditionedRadioStation();
        }
        if (nextRadioStation < 9) {
            currentNumberAuditionedRadioStation = nextRadioStation + 1;
        }
    }
    public void setPrevRadioStation(int prevRadioStation) {
        if (prevRadioStation < 0) {
            setMaxNumberAuditionedRadioStation();
        }
        if (prevRadioStation > 0) {
            currentNumberAuditionedRadioStation = prevRadioStation - 1;
        }
    }
    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            setMaxVolume();
        }
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
    }
    public void setReduceVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            setMinVolume();
        }
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
    }
}



