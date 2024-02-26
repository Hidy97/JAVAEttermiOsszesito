package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import model.Etel;

public class main {

    public static void main(String[] args) throws IOException {
        etteremFeladat();
    }

    private static void etteremFeladat() throws IOException {
        //Itt példányosítjuk a nézetet és a modellt
        //Etel etel = new Etel();
        //etel.etelKimutat();
        
        //File fajlom = new File("src/Ételek.txt");
        //System.out.println(fajlom.exists()); //létezik?
        //System.out.println(fajlom.canRead()); //olvasható?
        Path eleresiut = Path.of("src/Ételek.txt");
        List<String> beolvasottFajl = Files.readAllLines(eleresiut);
        System.out.println(beolvasottFajl);
        for (String sor : beolvasottFajl) {
            String[] tisztit = sor.split("|");
            String nev = tisztit[0];
            int ar = Integer.parseInt(tisztit[1]);
        }
    }
    
}
