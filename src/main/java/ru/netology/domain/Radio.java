package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int volume;
    private int defaultStation = 10;

    public Radio(int defaultStation) {
        this.defaultStation = defaultStation;
    }

    public Radio() {
    }

    public int getDefaultStation() {
        return defaultStation;
    }

    public void setDefaultStation(int defaultStation) {
        this.defaultStation = defaultStation;
    }

    public void pushNextButton() {
        if (this.currentStation == 10) {
            this.currentStation = 0;
        } else {
            this.currentStation ++;
        }
    }

    public void pushPrevButton() {
        if (this.currentStation == 0) {
            this.currentStation = 10;
        } else {
            this.currentStation--;
        }
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean volumeMax() {
        return this.volume == 100;
    }

    public boolean volumeMin() {
        return this.volume == 0;
    }

    public void volumeUp() {
        if (this.volumeMax()) {
            return;
        }
        this.volume++;
    }

    public void volumeDown() {
        if (this.volumeMin()) {
            return;
        }
        this.volume--;
    }

    public int getVolume() {
        return volume;
    }
}