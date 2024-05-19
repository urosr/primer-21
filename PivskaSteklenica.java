/**
 * PivskaSteklenica.java
 *
 * Opis:
 * Delo s pivskimi steklenicami
 *
 * @author Uroš Raztresen
 * @version Primer 20 (GUI)
 */

/**
 * Javni razred, ki razširja razred Steklenica in implementira vmesnik AlkoholnaPijaca
 */

public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
    
    // Vse lastnosti od nadrazreda se prenesejo
    // Deklariramo dodatne zasebne lastnosti, ki so značilne le za pivske steklenice
    private String znamka;
    private double temperatura;
    private double stopnjaAlkohola;
    
    // Statična lastnost, ki je enaka vsem pivskim steklenicam (vsem objektom razreda)
    private static String material = "Steklo";  // Vse pivske steklenice so steklene
    
    /** Javni konstruktor za ustvarjanje novega objekta tipa/razreda PivskaSteklenica
     * @param z Znamka piva
     * @param k Kapaciteta v mililitrih
     * @return Nov objekt tipa PivskaSteklenica
     */    
	public PivskaSteklenica (String z, int k) {
        
        // Pokličem drug konstruktor tega istega razreda
        this (z, k, 4.5);        
        
    }
    
    /** Javni konstruktor za ustvarjanje novega objekta tipa/razreda PivskaSteklenica
     * @param z Znamka piva
     * @param k Kapaciteta v mililitrih
     * @param s Stopnja alkohola
     * @return Nov objekt tipa PivskaSteklenica
     */    
	public PivskaSteklenica (String z, int k, double s) {
        
        // Pokličemo konstruktor nadrazreda
        super(k, "pivo");
        
        // Inicializiramo še dodatne lastnosti podrazreda
        znamka = z;
        temperatura = 5.0;
        
        // Inicializiramo privzeto stopnjo alkohola
        stopnjaAlkohola = s;
        
        // Izpišemo podatke
		System.out.println("Pivska steklenica je znamke " + z + ".");
        
    }
    
    /** Javna getter metoda, ki vrne stopnjo alkohola
     * @return stopnja alkohola
     */
    public double getStopnjaAlkohola() {
        // Vrnemo stopnjo alkohola
        return stopnjaAlkohola;
    }
    
    /** Javna getter metoda, ki vrne znamko piva
     * @return znamka piva
     */
    public String getZnamka() {
        // Vrnemo znamko
        return znamka;
    }

}
