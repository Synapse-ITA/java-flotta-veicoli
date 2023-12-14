package org.lessons.java.flottaveicoli;

public class Motociclette extends Veicoli{

    // attributi
    private boolean cavalletto = true;

    // costruttore

    public Motociclette(String targa, int immatricolazione, boolean cavalletto) {
        super(targa, immatricolazione);
        this.cavalletto = cavalletto;
    }

    // getter and setter

    public boolean isCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }


    // moduli

    @Override
    public String visualizzaInformazioni() {
        return "Motocicletta - Targa: " + getTarga() + ", Anno: " + getImmatricolazione() + ", Cavalletto: " + cavalletto;
    }
}
