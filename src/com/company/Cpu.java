package com.company;

public class Cpu extends Over{
    private int Cores;

    public Cpu(String name, int debut, int mhz, int cores) {
        super(name, debut, mhz);
        Cores = cores;
    }

    public int getCores() {
        return Cores;
    }

    public void setCores(int cores) {
        Cores = cores;
    }
}
