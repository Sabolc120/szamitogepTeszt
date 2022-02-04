package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Computer {
    private Gpu gpu;
    private Cpu cpu;
    private Ram ram;
    private int price;

    public Computer(Gpu gpu, Cpu cpu, Ram ram, int price) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
    }

    public Gpu getGpu() {
        return gpu;

    }
    public void computerOptions(){
        out.println("Melyik gépet szeretnéd megnézni?");
        out.println("\t1. High-end mid tier");
        out.println("\t2. Belépő tier");
        out.println("\t3. High-end tier");
        out.println("\t4. Mid-tier");
        out.println("\t5. Elavult-tier");
        out.println("\t6. Kilépés");
    }
    public void buy(){
        System.out.println("Számítógép ár: "+getPrice());
        System.out.println("Szeretnéd megvásárolni a számítógépet?");
        System.out.println("\t1. Igen");
        System.out.println("\t2. Nem");
        System.out.println("Írd be a sorszámot!");
    }
    public void gameList(){
        System.out.println("Milyen játékon szeretnéd letesztelni a számítógépet?");
        System.out.println("Írja be azt a sorszámot!");
        System.out.println("\t1. Grand Theft Auto V");
        System.out.println("\t2. Genshin Impact");
        System.out.println("\t3. Minecraft");
        System.out.println("\t4. Forza Horizon 5");
        System.out.println("Az ajánlott rendszerkövetelmények alapján lesz ellenőrizve a rendszer.");
    }
    public void systemCheckCPU_FALSE(){
        System.out.println("Processzor korszerűtlen az ajánlott játék követelményekhez képest.");
        System.out.println("\t Jelenlegi processzor kiadási éve: "+getCpu().getDebut());
    }
    public void systemCheckRAM_FALSE(){
        System.out.println("Memória méret nem felel meg a követelményeknek.");
        System.out.println("\t Jelenlegi elérhető memória: "+ram.getGb());
    }
    public void systemCheckGPU_OK(){
        System.out.println("Videókártya memória megfelel, elérhető memória: "+gpu.getGb());
        System.out.println("Videókártya kiadása korszerű az ajánlott követelményeknek: "+gpu.getDebut()+" Évben lett kiadva.");
    }
    public void systemCheckGPUgb_FALSE(){
        System.out.println("Videókártya memória méret nem felel meg. ");
        System.out.println("\tJelenlegi videókártya memória méret: "+gpu.getGb());
    }
    public void systemCheckGPUdebut_FALSE(){
        System.out.println("Videókártya korszerűtlen a játék ajánlott követelményeinek.");
        System.out.println("\tJelenlegi videókártya kiadási év: "+gpu.getDebut());
    }
    public void systemCheckGPU_FALSE(){
        System.out.println("Videókártya korszerűtlen a játék ajánlott követelményeinek.");
        System.out.println("Videókártya memória méret nem felel meg.");
        System.out.println("\tJelenlegi videókártya méret: "+gpu.getGb());
        System.out.println("\t Jelenlegi videókártya kiadási év: "+gpu.getDebut());
    }
    public void getDetails(){
        System.out.println("Videókártya tulajdonságok: ");
        System.out.println("\tNév: "+gpu.getName());
        System.out.println("\tMemória méret: "+gpu.getGb()+" Gb");
        System.out.println("\tÓrajel: "+gpu.getMhz()+" Mhz");
        System.out.println("\tKiadási éve: "+gpu.getDebut());


        System.out.println("Processzor tulajdonságok: ");
        System.out.println("\tNév: "+cpu.getName());
        System.out.println("\tÓrajel: "+cpu.getMhz()+" Mhz");
        System.out.println("\tMagok száma: "+cpu.getCores());
        System.out.println("\tKiadási éve: "+cpu.getDebut());

        System.out.println("Memória tulajdonságok: ");
        System.out.println("\tNév: "+ram.getName());
        System.out.println("\tMemória méret: "+ram.getGb()+" GB");
        System.out.println("\tMemória tipus: "+ram.getType());
        System.out.println("\tMemória órajel: "+ram.getMhz()+" Mhz");
        System.out.println("\tKiadási éve: "+ram.getDebut());

        System.out.println("Számítógép ára: "+price+" Forint");
    }
    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
