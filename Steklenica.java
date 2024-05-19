/**
 * Steklenica.java
 *
 * Opis:
 * Delo s steklenicami
 *
 * @author Uroš Raztresen
 * @version 18 (javljanje izjem)
 */

/**
 * Javni razred za prikaz dela z razredi in objekti
 */

public class Steklenica {
    
    // Deklariramo lastnosti steklenice
    private int kapaciteta;         // v mililitrih
    private boolean jeOdprta;
    private String vrstaVsebine;
    private int kolicinaVsebine;    // v mililitrih
    
    /** Javna konstruktor za ustvarjanje novega objekta tipa/razreda Steklenica
     * @param k Kapaciteta steklenice
     * @param v Vrsta vsebine steklenice
     * @return Nov objekt tipa Steklenica
     */
    
	public Steklenica (int k, String v) {
        
        // Inicializiramo lastnosti
        kapaciteta = k;
        jeOdprta = false;
        vrstaVsebine = v;
        kolicinaVsebine = k;
        
        // Izpišemo podatke
		System.out.println("Ustvarjam objekt tipa Steklenica kapacitete " + k + " z vsebino " + v + ".");
        
    }
    
    /** Javna metoda, ki izprazni vsebino iz steklenice
     * @param k Količina, ki jo želimo izprazniti
     * @return Vsebina streklenice
     * @throws Vrže izjemo, če je steklenica zaprta
     */
    
	public String izprazni (int k) throws Exception {
        
        // Če je steklenica odprta
        if (jeOdprta) {
            
            // Zmanjšamo količino vsebine za iztočeno količino
            System.out.println("Količina pred praznjenjem: " + kolicinaVsebine);
            kolicinaVsebine = kolicinaVsebine - k;
            System.out.println("Količina po praznjenju: " + kolicinaVsebine);
            
            // Vrnemo vrsto vsebine
            return vrstaVsebine;
            
        }
        // Če je steklenica zaprta, vrže izjemo
        else {
            throw new Exception("Ne morem izprazniti steklenice, ker je zaprta.");
        }
    
    }
    
    /** Javna metoda, ki odpre steklenico
     * @return Vrne true, če je bilo odpiranje uspešno ali false, če je bila steklenica že odprta
     */
    
	public boolean odpri () {
        
        // Če je steklenica že odprta
        if (jeOdprta) {
            
            // Vrnemo false (ker je bila že odprta)
            return false;
            
        }
        
        // Če je steklenica zaprta
        else {
            
            // Spremenimo lastnost (jo odpremo)
            jeOdprta = true;
            
            // Vrnemo true (ker je bilo odpiranje uspešno)
            return true;
            
        }
    
    }
    
    /** Javna metoda, ki vrne količino vsebine
     * @return Vrne količino vsebine steklenice
     */
    
	public int getKolicinaVsebine () {
        
        // Vrnemo količino vsebine
        return kolicinaVsebine;
        
    }

}
