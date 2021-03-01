package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioImprovedTest {

    @Test
    public void validateChangFields() {
        RadioImproved radio = new RadioImproved(10, 0, 5, 100, 0,5);
        assertEquals(5,radio.getCurrentRadioStation());
    }

    @Test
    public void changeAfterLastRadioStation() {
        RadioImproved radio = new RadioImproved(10,0,10,100,0,5);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        RadioImproved radio = new RadioImproved(10,0,0,100,0,5);
        radio.pressPrevStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        RadioImproved radio = new RadioImproved(10,0,6,100,0,5);
        radio.pressNextStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        RadioImproved radio = new RadioImproved(10,0,6,100,0,5);
        radio.pressPrevStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void afterInitialRadioStation() {
        RadioImproved radio = new RadioImproved(10,0,11,100,0,5);
        assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void underInitialRadioStation() {
        RadioImproved radio = new RadioImproved(10,0,-1,100,0,5);
        assertEquals(0, radio.getMinRadioStation());
    }

// volume
    @Test
    public void volumeOverMax() {
        RadioImproved radio = new RadioImproved(10,0,3,100,0,120);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        RadioImproved radio = new RadioImproved(10,0,3,100,0,-1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void plusVolume() {
        RadioImproved radio = new RadioImproved(10,0,3,100,0,4);
        radio.pressPlusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        RadioImproved radio = new RadioImproved(10,0,3,100,0,4);
        radio.pressMinusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }
}