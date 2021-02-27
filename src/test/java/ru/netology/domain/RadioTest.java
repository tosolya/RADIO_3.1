package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void createRadio() {
        Radio radio = new Radio();
    }

    @Test
    public void validateZeroValues() {
        Radio radio = new Radio();
        assertEquals(0,radio.maxRadioStation);
        assertEquals(0,radio.minRadioStation);
        assertEquals(0,radio.currentRadioStation);
        assertEquals(0,radio.maxVolume);
        assertEquals(0,radio.minVolume);
        assertEquals(0,radio.currentVolume);
        assertNull(radio.name);
        assertFalse(radio.on);
    }

    @Test
    @Disabled
    public void shouldNPE() {
        Radio radio = new Radio();
        assertEquals(0,radio.name.length());
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0,radio.currentRadioStation);
        radio.currentRadioStation = -100;
        assertEquals(-100,radio.currentRadioStation);
    }
}
