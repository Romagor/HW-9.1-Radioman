package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioStation() {
        Radio radio = new Radio();

        radio.currentNumberAuditionedRadioStation = 5;

        int expected = 5;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setAboveMaxRadioStation() {
        Radio radio = new Radio();

        radio.next(10);

        int expected = 0;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBelowMaxRadioStation() {
        Radio radio = new Radio();

        radio.next(8);

        int expected = 8;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxRadioStation() {
        Radio radio = new Radio();

        radio.next(9);

        int expected = 9;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setBelowMinRadioStation() {
        Radio radio = new Radio();

        radio.prev(-1);

        int expected = 9;
        int actual = radio.getNumberAuditionedRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setAboveMinRadioStation() {
        Radio radio = new Radio();
        radio.prev(1);

        int expected = 1;
        int actual = radio.getNumberAuditionedRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinRadioStation() {
        Radio radio = new Radio();
        radio.prev(0);

        int expected = 0;
        int actual = radio.getNumberAuditionedRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 5;

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setAboveMaxVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBelowMaxVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBelowMinVolume() {
        Radio radio = new Radio();

        radio.reduceVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setAboveMinVolume() {
        Radio radio = new Radio();

        radio.reduceVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();

        radio.reduceVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
