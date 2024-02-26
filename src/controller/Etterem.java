package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import model.Asztal;
import model.Etel;

public class Etterem {
    public static final String HUF = "Ft";
    
    private ArrayList<Asztal> asztalok;
    private ArrayList<Etel> etlap;

    public Etterem(ArrayList<Asztal> asztalok, ArrayList<Etel> etlap) {
        this.asztalok = asztalok;
        this.etlap = etlap;
    }
    
    //public static final String HUF = "Ft";
    //Tagfüggvények: Etterem(), List<Asztal> getAsztalok, void etlapotFajlbolFeltolt, void rendelesekFajlbolFeltolt, Etel eteltKivalaszt(String etelNeve)

    public ArrayList<Asztal> getAsztalok() {
        return asztalok;
    }
    
    public void etlapotFajlbolFeltolt() throws IOException{
        Path eleresiut = Path.of("src/Ételek.txt");
        List<String> beolvasottFajl = Files.readAllLines(eleresiut);
        for (String sor : beolvasottFajl) {
            String[] adat = sor.split("|");
            String nev = adat[0];
            int ar = Integer.parseInt(adat[1]);
            new Etel(nev, ar);
        }
    }
    
    
    public void rendeleseketFajlbolFeltolt() throws IOException{
        Path eleresiut = Path.of("src/Rendelés.txt");
        List<String> beolvasottFajl = Files.readAllLines(eleresiut);
        for (String sor : beolvasottFajl) {
            String[] rendelesek = sor.split("\n");
            //String asztalNev = rendelesek[1];
            //String rendeles
        }
    }
}
