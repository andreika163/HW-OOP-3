package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
// в дефолтных тестах станция всегда на нуле

    @Test
    void stationUnderLimit() {
        Radio service = new Radio();

        service.setCurrentStation(-1);
        assertEquals(0, service.getCurrentStation());
    }

    @Test
    void stationAboveLimit() {
        Radio service = new Radio();

        service.setCurrentStation(10);
        assertEquals(0, service.getCurrentStation());

        service.setCurrentStation(4);
        assertEquals(4, service.getCurrentStation());
    }

    @Test
    void stationAboveLimitConstructor() {
        Radio service = new Radio(20);

        service.setCurrentStation(-1);
        assertEquals(0, service.getCurrentStation());

        service.setCurrentStation(5);
        assertEquals(5, service.getCurrentStation());
    }

    @Test
    void stationPrevButton() {
        Radio service = new Radio();

        service.prevButton();
        assertEquals(9, service.getCurrentStation());
        service.prevButton();
        assertEquals(8, service.getCurrentStation());
    }

    @Test
    void stationPrevButtonConstructor() {
        Radio service = new Radio(25);

        service.prevButton();
        assertEquals(24, service.getCurrentStation());
        service.prevButton();
        assertEquals(23, service.getCurrentStation());
    }

    @Test
    void stationNextButton() {
        Radio service = new Radio();

        service.setCurrentStation(8);

        service.nextStation();
        assertEquals(9, service.getCurrentStation());
        service.nextStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test
    void stationNextButtonConstructor() {
        Radio service = new Radio(30);

        service.setCurrentStation(28);

        service.nextStation();
        assertEquals(29, service.getCurrentStation());
        service.nextStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test
    void volumeUp() {
        Radio service = new Radio();

        service.volumeUp();
        assertEquals(1, service.getVolume());
        service.volumeUp();
        assertEquals(2, service.getVolume());
    }

    @Test
    void volumeUpAboveMax() {
        Radio service = new Radio();

        int i = 0;
        while (i <=100) {
            service.volumeUp();
            i++;
        }
        assertEquals(100, service.getVolume());
    }

    @Test
    void volumeUpEndDown() {
        Radio service = new Radio();

        service.volumeUp();
        assertEquals(1, service.getVolume());
        service.volumeUp();
        assertEquals(2, service.getVolume());

        service.volumeDown();
        assertEquals(1, service.getVolume());
        service.volumeDown();
        assertEquals(0, service.getVolume());
    }

    @Test
    void volumeDownMin() {
        Radio service = new Radio();

        service.volumeDown();
        assertEquals(0, service.getVolume());
    }
}