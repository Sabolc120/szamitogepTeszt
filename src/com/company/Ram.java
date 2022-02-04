package com.company;

public class Ram extends Over{
    private int Gb;
    private String type; //DDR3, 4, 2...

    public Ram(String name, int debut, int mhz, int gb, String type) {
        super(name, debut, mhz);
        Gb = gb;
        this.type = type;
    }

    public int getGb() {
        return Gb;
    }

    public void setGb(int gb) {
        Gb = gb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
