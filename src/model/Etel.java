package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//Étel txt
public class Etel {
    private String nev;
    private int ar;

    public Etel(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }

    public Etel(String sor) {
        String[] adatok = sor.split("|");
        this.nev = adatok[0];
        this.ar = Integer.parseInt(adatok[0]);
    }
    
    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

}
