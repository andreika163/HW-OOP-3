package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();


    @Test
    void setDefaultStation() {
        radio.setDefaultStation(10);
        assertEquals(10,radio.getDefaultStation());

        radio.setDefaultStation(5);
        assertEquals(5, radio.getDefaultStation());

    }


    @Test
    void pushNextButtonDefaultStation() {
        Radio radio = new Radio(10);

        assertEquals(0,radio.getCurrentStation());

        radio.pushNextButton();
        assertEquals(1,radio.getCurrentStation());

        radio.setCurrentStation(10);
        radio.pushNextButton();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void pushPrevButton() {
        Radio radio = new Radio();

        radio.pushPrevButton();
        assertEquals(10, radio.getCurrentStation());
        radio.pushPrevButton();
        assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(0);
        radio.pushPrevButton();
        assertEquals(10,radio.getCurrentStation());
    }

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();
// проверим что звук впринципе изменяется по требованию
        radio.setVolume(0);

        radio.volumeUp();
        assertEquals(1,radio.getVolume());
        radio.volumeUp();
        assertEquals(2,radio.getVolume());

// проверим что звук не меняется после максимального уровня
        radio.setVolume(100);
        radio.volumeUp();
        assertEquals(100,radio.getVolume());
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
// проверим что звук не меняется после минимума
        radio.setVolume(0);

        radio.volumeDown();
        assertEquals(0, radio.getVolume());
// проверим что звук впринципе изменяется по требованию
        radio.setVolume(100);
        radio.volumeDown();
        assertEquals(99,radio.getVolume());
    }

    @Test
    void setVolume(){
        Radio radio =new Radio();
        radio.setVolume(7);
        assertEquals(7,radio.getVolume());
    }
}