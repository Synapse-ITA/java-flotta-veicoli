package org.lessons.java.flottaveicoli;

public class Automobili extends Veicoli{

    // attributi
    private int numPorte;

    // costruttore

    public Automobili(String targa, int immatricolazione, int numPorte) {
        super(targa, immatricolazione);
        this.numPorte = numPorte;
    }


    // getter and setter

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }


    // moduli




    @Override
    public String visualizzaInformazioni() {
        return "Automobile - Targa: " + getTarga() + ", Anno: " + getImmatricolazione() + ", Porte: " + numPorte;
    }
}
