package model;

import java.util.ArrayList;
import java.util.List;

public class Asztal {
    //adott asztal
    //String asztal;
    //List<Object> tetelek;
    //Tanári megoldás erre:
    private String szin;
    private ArrayList<Etel> rendelesek;
    
    //Tagfüggvények: Asztal(String szin), getSzin, ujEtel(Etel etel), getRendelesek, getOsszAr,

    /*
    public Asztal(String asztal, List<Object> tetelek) {
        this.asztal = asztal;
        this.tetelek = tetelek;
    }
*//*
    public Asztal(String asztal, List<Object> tetelek) {
        this.asztal = asztal;
        this.tetelek = tetelek;
    }
*/

    //rendelések txt
    public Asztal(String szin, ArrayList<Etel> rendelesek) {
        this.szin = szin;
        this.rendelesek = rendelesek;
    }
    
    

    /*
    public int vegosszegKiszamolasa() {
        int vegosszeg = 0;
        for (int i = 0; i < tetelek.size(); i++) {
            //vegosszeg += tetelek.;
            
        }
        return vegosszeg;
    }
    
    public void nyugta(){
        System.out.printf("%s asztal", asztal);
        
        
    }
*/
}
