package com.company;

public class Over {
    private String name;
    private int debut;
    private int Mhz;

    public Over(String name, int debut, int mhz) {
        this.name = name;
        this.debut = debut;
        Mhz = mhz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getMhz() {
        return Mhz;
    }

    public void setMhz(int mhz) {
        Mhz = mhz;
    }
}
