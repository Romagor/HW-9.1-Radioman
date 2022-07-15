package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberAuditionedRadioStation(5);

        int expected = 5;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setMaxRadioStation() {
        Radio radio = new Radio();

        radio.setMaxNumberAuditionedRadioStation();

        int expected = 9;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setMinRadioStation() {
        Radio radio = new Radio();

        radio.setMinNumberAuditionedRadioStation();

        int expected = 0;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void notSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setNextRadioStation(10);

        int expected = 0;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setNextRadioStationToMax() {
        Radio radio = new Radio();

        radio.setNextRadioStation(8);

        int expected = 9;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void notSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(-1);

        int expected = 9;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void setNextRadioStationToMin() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(1);

        int expected = 0;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void notSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void setVolumeToMax() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(9);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void notSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setReduceVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void setVolumeToMin() {
        Radio radio = new Radio();

        radio.setReduceVolume(1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


