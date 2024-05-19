/**
 * HelloWorld.java
 *
 * Opis:
 * Program, ki v ukazno konzolo izpiše "Pozdravljen, Svet!"
 * V nadaljevanju služi prikazu delovanja razredov in objektov
 *
 * @author Uroš Raztresen
 * @version Primer 19a (vmesnik)
 */

// Uvozimo vse razrede iz paketa za delo v V/I napravami in pripomočke
import java.io.*;
import java.util.*;

/**
 * Javni razred za prikaz delovanja Jave
 */
public class HelloWorld {
    
    // Deklariramo statične lastnosti
    
    // Objekt za vnos iz konzole
    private static BufferedReader in;
    
    // Deklariramo abstraktni seznam objektov razreda PivskaSteklenica
    private static ArrayList<PivskaSteklenica> pivskeSteklenice;
    
    /** Javna statična metoda, ki se izvede ob zagonu programa
     * @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
     * @return Metoda ne vrača nič (ker je tipa void)
     */
    
	public static void main (String[] args) {
        
        // Inicializiramo statično lastnost za vnos iz tipkovnice
        // Konstruktor kot vhodni parameter prejme anonimni objekt razreda InputStreamReader
        in = new BufferedReader(new InputStreamReader(System.in));
        
        // Inicializiramo seznam pivskih steklenic
        pivskeSteklenice = new ArrayList<PivskaSteklenica>();
        
        // Izpišemo pozdrav v konzolo
		System.out.println("Pozdravljen, Svet!");
        
        // Ustvarimo dva objekta tipa/razreda Steklenica
        Steklenica zganje = new Steklenica(50, "žganje");
        Steklenica voda = new Steklenica(500, "voda");
        
        // Deklariramo in inicializiramo spremenljivko za količino vode
        int kv = 0;
        
        // Poskusimo prebrati niz s tipkovnice
        try {
            
            System.out.println("Koliko vode naj natočim v kozarec?");
            
            // Niz, vnešen preko tipkovnice, preberemo v spremenljivko
            String kolicinaVode = in.readLine();
            
            // Niz zapišemo v celo število
            kv = Integer.parseInt(kolicinaVode);
            
            System.out.println("V kozarec bom natočil " + kolicinaVode + "ml vode.");
        }
        catch (Exception e) {
            System.out.println("Prišlo je do napake pri vnosu:" + e);
        }
        
        // Iz steklenice za vodo poskusimo izprazniti toliko, kot smo vnesli v konzoli
        // (kličemo metodo izprazni objekta "voda")
        try {
            voda.odpri();
            String vsebinaKozarca = voda.izprazni(kv);
            System.out.println("Vsebina kozarca je " + vsebinaKozarca + ".");
        }
        catch (Exception e) {
            System.out.println("Prišlo je do napake pri praznjenju steklenice:" + e);
        }
        
        // Odpremo steklenico z žganjem
        zganje.odpri();
        
        // Iz steklenice z žganjem poskusimo napraviti požirek
        try {
            String pozirek = zganje.izprazni(20);
            System.out.println("Naredili smo požirek " + pozirek);
        }
        catch (Exception e) {
            System.out.println("Prišlo je do napake pri praznjenju steklenice žganja:" + e);
        }
        
        // Ustvarimo tri pivske steklenice
        PivskaSteklenica velikoLasko = new PivskaSteklenica("Laško", 500);
        PivskaSteklenica maliUnion = new PivskaSteklenica("Union", 330);
        PivskaSteklenica heineken = new PivskaSteklenica("Heineken", 330);
        
        // Dodamo novo brezalkoholno pivo (anonimni objekt)
        pivskeSteklenice.add(new PivskaSteklenica("Laško Malt", 500, 0.0));
        
        // Steklenice dodamo v seznam
        pivskeSteklenice.add(velikoLasko);
        pivskeSteklenice.add(maliUnion);
        pivskeSteklenice.add(heineken);
        
        // Odpremo vse steklenice v seznamu
        for (int c = 0; c < pivskeSteklenice.size(); c++) {
            if (pivskeSteklenice.get(c).odpri()) {
                System.out.println("Steklenica na mestu št. " + c + " uspešno odprta.");
            }
        }
        
        // Kličemo metode, ki so bile deklarirane že v nadrazredu
        try {
//            velikoLasko.odpri();
            System.out.println("Naredili smo požirek " + velikoLasko.izprazni(50));
        }
        catch (Exception e) {
            System.out.println("Prišlo je do napake pri praznjenju steklenice Laškega:" + e);
        }
        
    }
}
