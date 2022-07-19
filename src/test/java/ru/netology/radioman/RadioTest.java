package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationUpToMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.setNextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetNextRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.setNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetNumberRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.setNextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetNumberRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.setPrevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationDownToMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.setPrevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.setPrevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.setIncreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setIncreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setIncreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetNumberVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetNumberVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setReduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeDownToMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.setReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notReduceVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCountRadioStationMax() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void setCountRadioStationMin() {
        Radio radio = new Radio(1);

        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void setNextNumberRadioStationToMax() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(8);

        radio.setNextRadioStation();

        int expected = 9;

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void setPrevNumberRadioStationFromMax() {
        Radio radio = new Radio(9);
        radio.setCurrentRadioStation(9);

        radio.setPrevRadioStation();

        int expected = 8;

        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationAboveMax() {
        Radio radio = new Radio(1);
        radio.setCurrentRadioStation(9);

        radio.setNextRadioStation();

        int expected = 0;

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationToMin() {
        Radio radio = new Radio(1);
        radio.setCurrentRadioStation(1);

        radio.setPrevRadioStation();

        int expected = 0;

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationFromMin() {
        Radio radio = new Radio(2);
        radio.setCurrentRadioStation(0);

        radio.setNextRadioStation();

        int expected = 1;

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void setNumberRadioStationBelowMin() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);

        radio.setPrevRadioStation();

        int expected = 9;

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }
}
