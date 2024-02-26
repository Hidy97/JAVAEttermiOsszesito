package nezet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Asztal;

public class Rendel {

    private String asztalNev;
    private String elnevezes;
    private int ar;
    private Map<String, Integer> tetel ;

    public Rendel(String asztalNev, String elnevezes, int ar, Map<String, Integer> tetel) {
        this.asztalNev = "Kék";
        this.elnevezes = elnevezes;
        this.ar = ar;
        this.tetel = new HashMap<>();
        //Forrás: https://www.geeksforgeeks.org/map-interface-java-examples/
        //Map<String, Integer> hm = new HashMap<String, Integer>();
        //tetel.put(elnevezes, ar);
        
    }

    public void setTetel(Map<String, Integer> tetel) {
        tetel.put(elnevezes, ar);
        this.tetel = tetel;
    }

    public Map<String, Integer> getTetel() {
        return tetel;
    }

    
}
