package com.company;

public class Gpu extends Over {
   private int Gb;

    public Gpu(String name, int debut, int mhz, int gb) {
        super(name, debut, mhz);
        Gb = gb;
    }

    public int getGb() {
        return Gb;
    }

    public void setGb(int gb) {
        Gb = gb;
    }
}
