package com.company;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    //Ebben a programban létrehoztam különböző számítógép rendszereket objektumokban, a felhasználó ki tudja ezeket listázni,
    //megvenni, letesztelni különböző játékokon hogy megfelel-e a követelményeknek.(4 játékon lehet letesztelni)
    //Ha nem felel meg, a program meg mondja miért nem felel meg. A tesztelés Ajánlott követelmények alapján van, nem minimális alapján.
    //A program magyar nyelven van megírva, OOP szintet használ.
    //A számítógép vásárlást egy kis bónuszként gondoltam belerakni, és igen, normális ha tovább fut ha nem vetted meg.
    //Hardver források, és követelmények: Az internet, nem kitalált..

    public static void main(String[] args) {
        Computer DESKTOP112 = new Computer(new Gpu("GTX1660",2019,1785,6),
                new Cpu("Ryzen 5 2600",2018,3400,6),
                new Ram("Hyperx Fury",2014,3200,16,"DDR4"),
                360000);
        Computer DESKTOP31T2 = new Computer(new Gpu("GTX750TI",2014,1020,2),
                new Cpu("Intel I5-2500",2011,3300,4),
                new Ram("Kingston",2014, 1600,8,"DDR3"),
                160000);
        Computer DESKTOP46T23 = new Computer(new Gpu("RTX3080",2020,1710,12),
                new Cpu("Ryzen 9 5950x",2020,3400,16),
                new Ram("Fury Hyperx",2021,6000,32,"DDR5"),
                1500000);
        Computer DESKTOP1242 = new Computer(new Gpu("GTX1050TI",2016,1392,4),
                new Cpu("Ryzen 3 1200",2017,3100,4),
                new Ram("Kingston",2014,2600,8,"DDR4"),
                230000);
        Computer DESKTOP343T = new Computer(new Gpu("GTX550TI",2011,1026,1),
                new Cpu("AMD Phenom X4 9650",2008,2300,4),
                new Ram("CSX",2003,800,4,"DDR2"),
                34000);
        Random veletlen = new Random();
        int money = veletlen.nextInt(250000, 2300000);
        Scanner scanner = new Scanner(in);
        boolean isON = true;
        while(isON){
            DESKTOP112.computerOptions();
            int whichComputer = scanner.nextInt();
            switch(whichComputer){
                case 1:
                    DESKTOP112.getDetails();
                    DESKTOP112.buy();
                    out.println("Elérhető pénz: "+money);
                    int buy_answer = scanner.nextInt();
                    if(buy_answer == 1){
                        if(money >= DESKTOP112.getPrice()){
                            out.println("Vásárlás sikeres, köszönjük a vásárlást.");
                        }
                        else{
                            out.println("Nem elegendő egyenleg, vásárlás sikertelen.");
                        }
                    }
                    DESKTOP112.gameList();
                    byte answer = scanner.nextByte();
                    if(answer == 1){
                        int gbGpu = DESKTOP112.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP112.getGpu().getDebut();
                        if(gbGpu >=2 && kiadasiEvGpu >= 2012){
                            DESKTOP112.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 2){
                            DESKTOP112.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 2GB");
                        }
                        else if(kiadasiEvGpu < 2012){
                            DESKTOP112.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        else{
                            DESKTOP112.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 2GB");
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        int ramGb = DESKTOP112.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP112.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP112.getCpu().getDebut();
                        if(cpuDebut >= 2012){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP112.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2012");
                        }
                    }
                    if (answer == 2){
                        int gbGpu = DESKTOP112.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP112.getGpu().getDebut();
                        if(gbGpu >=6 && kiadasiEvGpu >= 2016){
                            DESKTOP112.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 6){
                            DESKTOP112.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 6GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP112.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP112.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 6GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP112.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP112.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP112.getCpu().getDebut();
                        if(cpuDebut >= 2008){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP112.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2008");
                        }
                    }
                    if(answer == 3){
                        int gbGpu = DESKTOP112.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP112.getGpu().getDebut();
                        if(gbGpu >=1 && kiadasiEvGpu >= 2013){
                            DESKTOP112.systemCheckGPU_OK();
                        }
                        else if(kiadasiEvGpu < 2013){
                            DESKTOP112.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2013");
                        }
                        int ramGb = DESKTOP112.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP112.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP112.getCpu().getDebut();
                        if(cpuDebut >= 2014){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP112.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2014");
                        }
                    }
                    if(answer == 4){
                        int gbGpu = DESKTOP112.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP112.getGpu().getDebut();
                        if(gbGpu >= 8 && kiadasiEvGpu >= 2016){
                            DESKTOP112.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 8){
                            DESKTOP112.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 8GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP112.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP112.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 8GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP112.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP112.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP112.getCpu().getDebut();
                        if(cpuDebut >= 2017){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP112.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2017");
                        }
                    }
                    break;
                case 2:
                    DESKTOP31T2.getDetails();
                    DESKTOP31T2.buy();
                    out.println("Elérhető pénz: "+money);
                    buy_answer = scanner.nextInt();
                    if(buy_answer == 1){
                        if(money >= DESKTOP31T2.getPrice()){
                            out.println("Vásárlás sikeres, köszönjük a vásárlást.");
                        }
                        else{
                            out.println("Nem elegendő egyenleg, vásárlás sikertelen.");
                        }
                    }
                    DESKTOP31T2.gameList();
                    answer = scanner.nextByte();
                    if(answer == 1){
                        int gbGpu = DESKTOP31T2.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP31T2.getGpu().getDebut();
                        if(gbGpu >=2 && kiadasiEvGpu >= 2012){
                            DESKTOP31T2.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 2){
                            DESKTOP31T2.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 2GB");
                        }
                        else if(kiadasiEvGpu < 2012){
                            DESKTOP31T2.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        else{
                            DESKTOP31T2.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 2GB");
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        int ramGb = DESKTOP31T2.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP31T2.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP31T2.getCpu().getDebut();
                        if(cpuDebut >= 2012){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP31T2.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2012");
                        }
                    }
                    if (answer == 2){
                        int gbGpu = DESKTOP31T2.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP31T2.getGpu().getDebut();
                        if(gbGpu >=6 && kiadasiEvGpu >= 2016){
                            DESKTOP31T2.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 6){
                            DESKTOP31T2.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 6GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP31T2.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP31T2.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 6GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP31T2.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP31T2.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP31T2.getCpu().getDebut();
                        if(cpuDebut >= 2008){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP31T2.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2008");
                        }
                    }
                    if(answer == 3){
                        int gbGpu = DESKTOP31T2.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP31T2.getGpu().getDebut();
                        if(gbGpu >=1 && kiadasiEvGpu >= 2013){
                            DESKTOP31T2.systemCheckGPU_OK();
                        }
                        else if(kiadasiEvGpu < 2013){
                            DESKTOP31T2.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2013");
                        }
                        int ramGb = DESKTOP31T2.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP31T2.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP31T2.getCpu().getDebut();
                        if(cpuDebut >= 2014){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP31T2.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2014");
                        }
                    }
                    if(answer == 4){
                        int gbGpu = DESKTOP31T2.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP31T2.getGpu().getDebut();
                        if(gbGpu >= 8 && kiadasiEvGpu >= 2016){
                            DESKTOP31T2.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 8){
                            DESKTOP31T2.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 8GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP31T2.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP31T2.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 8GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP31T2.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP31T2.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP31T2.getCpu().getDebut();
                        if(cpuDebut >= 2017){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP31T2.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2017");
                        }
                    }
                    break;
                case 3:
                    DESKTOP46T23.getDetails();
                    DESKTOP46T23.buy();
                    out.println("Elérhető pénz: "+money);
                    buy_answer = scanner.nextInt();
                    if(buy_answer == 1){
                        if(money >= DESKTOP46T23.getPrice()){
                            out.println("Vásárlás sikeres, köszönjük a vásárlást.");
                        }
                        else{
                            out.println("Nem elegendő egyenleg, vásárlás sikertelen.");
                        }
                    }
                    DESKTOP46T23.gameList();
                    answer = scanner.nextByte();
                    if(answer == 1){
                        int gbGpu = DESKTOP46T23.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP46T23.getGpu().getDebut();
                        if(gbGpu >=2 && kiadasiEvGpu >= 2012){
                            DESKTOP46T23.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 2){
                            DESKTOP46T23.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 2GB");
                        }
                        else if(kiadasiEvGpu < 2012){
                            DESKTOP46T23.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        else{
                            DESKTOP46T23.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 2GB");
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        int ramGb = DESKTOP46T23.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP46T23.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP46T23.getCpu().getDebut();
                        if(cpuDebut >= 2012){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP46T23.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2012");
                        }
                    }
                    if (answer == 2){
                        int gbGpu = DESKTOP46T23.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP46T23.getGpu().getDebut();
                        if(gbGpu >=6 && kiadasiEvGpu >= 2016){
                            DESKTOP46T23.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 6){
                            DESKTOP46T23.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 6GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP46T23.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP46T23.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 6GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP46T23.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP46T23.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP46T23.getCpu().getDebut();
                        if(cpuDebut >= 2008){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP46T23.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2008");
                        }
                    }
                    if(answer == 3){
                        int gbGpu = DESKTOP46T23.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP46T23.getGpu().getDebut();
                        if(gbGpu >=1 && kiadasiEvGpu >= 2013){
                            DESKTOP46T23.systemCheckGPU_OK();
                        }
                        else if(kiadasiEvGpu < 2013){
                            DESKTOP46T23.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2013");
                        }
                        int ramGb = DESKTOP46T23.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP46T23.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP46T23.getCpu().getDebut();
                        if(cpuDebut >= 2014){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP46T23.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2014");
                        }
                    }
                    if(answer == 4){
                        int gbGpu =DESKTOP46T23.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP46T23.getGpu().getDebut();
                        if(gbGpu >= 8 && kiadasiEvGpu >= 2016){
                            DESKTOP46T23.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 8){
                            DESKTOP46T23.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 8GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP46T23.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP46T23.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 8GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP46T23.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP46T23.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP46T23.getCpu().getDebut();
                        if(cpuDebut >= 2017){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP46T23.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2017");
                        }
                    }
                    break;
                case 4:
                    DESKTOP1242.getDetails();
                    DESKTOP1242.buy();
                    out.println("Elérhető pénz: "+money);
                    buy_answer = scanner.nextInt();
                    if(buy_answer == 1){
                        if(money >= DESKTOP1242.getPrice()){
                            out.println("Vásárlás sikeres, köszönjük a vásárlást.");
                        }
                        else{
                            out.println("Nem elegendő egyenleg, vásárlás sikertelen.");
                        }
                    }
                    DESKTOP1242.gameList();
                    answer = scanner.nextByte();
                    if(answer == 1){
                        int gbGpu = DESKTOP1242.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP1242.getGpu().getDebut();
                        if(gbGpu >=2 && kiadasiEvGpu >= 2012){
                            DESKTOP1242.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 2){
                            DESKTOP1242.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 2GB");
                        }
                        else if(kiadasiEvGpu < 2012){
                            DESKTOP1242.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        else{
                            DESKTOP1242.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 2GB");
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        int ramGb = DESKTOP1242.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP1242.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP1242.getCpu().getDebut();
                        if(cpuDebut >= 2012){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP1242.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2012");
                        }
                    }
                    if (answer == 2){
                        int gbGpu = DESKTOP1242.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP1242.getGpu().getDebut();
                        if(gbGpu >=6 && kiadasiEvGpu >= 2016){
                            DESKTOP1242.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 6){
                            DESKTOP1242.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 6GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP1242.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP1242.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 6GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP1242.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP1242.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP1242.getCpu().getDebut();
                        if(cpuDebut >= 2008){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP1242.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2008");
                        }
                    }
                    if(answer == 3){
                        int gbGpu = DESKTOP1242.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP1242.getGpu().getDebut();
                        if(gbGpu >=1 && kiadasiEvGpu >= 2013){
                            DESKTOP1242.systemCheckGPU_OK();
                        }
                        else if(kiadasiEvGpu < 2013){
                            DESKTOP1242.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2013");
                        }
                        int ramGb = DESKTOP1242.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP1242.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP1242.getCpu().getDebut();
                        if(cpuDebut >= 2014){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP1242.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2014");
                        }
                    }
                    if(answer == 4){
                        int gbGpu = DESKTOP1242.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP1242.getGpu().getDebut();
                        if(gbGpu >= 8 && kiadasiEvGpu >= 2016){
                            DESKTOP1242.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 8){
                            DESKTOP1242.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 8GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP1242.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP1242.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 8GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP1242.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP1242.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP1242.getCpu().getDebut();
                        if(cpuDebut >= 2017){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP1242.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2017");
                        }
                    }
                    break;
                case 5:
                    DESKTOP343T.getDetails();
                    DESKTOP343T.buy();
                    out.println("Elérhető pénz: "+money);
                    buy_answer = scanner.nextInt();
                    if(buy_answer == 1){
                        if(money >= DESKTOP343T.getPrice()){
                            out.println("Vásárlás sikeres, köszönjük a vásárlást.");
                        }
                        else{
                            out.println("Nem elegendő egyenleg, vásárlás sikertelen.");
                        }
                    }
                    DESKTOP343T.gameList();
                    answer = scanner.nextByte();
                    if(answer == 1){
                        int gbGpu = DESKTOP343T.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP343T.getGpu().getDebut();
                        if(gbGpu >=2 && kiadasiEvGpu >= 2012){
                            DESKTOP343T.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 2){
                            DESKTOP343T.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 2GB");
                        }
                        else if(kiadasiEvGpu < 2012){
                            DESKTOP343T.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        else{
                            DESKTOP343T.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 2GB");
                            out.println("Ajánlott videókártya kiadási év: 2012");
                        }
                        int ramGb = DESKTOP343T.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP343T.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP343T.getCpu().getDebut();
                        if(cpuDebut >= 2012){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP343T.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2012");
                        }
                    }
                    if (answer == 2){
                        int gbGpu = DESKTOP343T.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP343T.getGpu().getDebut();
                        if(gbGpu >=6 && kiadasiEvGpu >= 2016){
                            DESKTOP343T.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 6){
                            DESKTOP343T.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 6GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP343T.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP343T.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 6GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP343T.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP343T.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP343T.getCpu().getDebut();
                        if(cpuDebut >= 2008){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP343T.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2008");
                        }
                    }
                    if(answer == 3){
                        int gbGpu = DESKTOP343T.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP343T.getGpu().getDebut();
                        if(gbGpu >=1 && kiadasiEvGpu >= 2013){
                            DESKTOP343T.systemCheckGPU_OK();
                        }
                        else if(kiadasiEvGpu < 2013){
                            DESKTOP343T.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2013");
                        }
                        int ramGb = DESKTOP343T.getRam().getGb();
                        if(ramGb >= 8){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP343T.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 8GB");
                        }
                        int cpuDebut = DESKTOP343T.getCpu().getDebut();
                        if(cpuDebut >= 2014){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP343T.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2014");
                        }
                    }
                    if(answer == 4){
                        int gbGpu = DESKTOP343T.getGpu().getGb();
                        int kiadasiEvGpu = DESKTOP343T.getGpu().getDebut();
                        if(gbGpu >= 8 && kiadasiEvGpu >= 2016){
                            DESKTOP343T.systemCheckGPU_OK();
                        }
                        else if (gbGpu < 8){
                            DESKTOP343T.systemCheckGPUgb_FALSE();
                            out.println("Ajánlott videó memória: 8GB");
                        }
                        else if(kiadasiEvGpu < 2016){
                            DESKTOP343T.systemCheckGPUdebut_FALSE();
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        else{
                            DESKTOP343T.systemCheckGPU_FALSE();
                            out.println("Ajánlott videókártya méret: 8GB");
                            out.println("Ajánlott videókártya kiadási év: 2016");
                        }
                        int ramGb = DESKTOP343T.getRam().getGb();
                        if(ramGb >= 16){
                            out.println("Memória méret megfelel, rendelkezésre álló memória: "+ramGb);
                        }
                        else{
                            DESKTOP343T.systemCheckRAM_FALSE();
                            out.println("Szükséges memória: 16GB");
                        }
                        int cpuDebut = DESKTOP343T.getCpu().getDebut();
                        if(cpuDebut >= 2017){
                            out.println("Processzor megfelel a követelményeknek.");
                        }
                        else{
                            DESKTOP343T.systemCheckCPU_FALSE();
                            out.println("Ajánlott processzor kiadási év: 2017");
                        }
                    }
                    break;
                case 6:
                    isON = false;
                    break;
                default:
                    out.println("Nincsen ilyen választási lehetőség.");
                    break;
            }
        }

    }

}
