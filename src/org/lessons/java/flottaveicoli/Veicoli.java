package org.lessons.java.flottaveicoli;

public abstract class Veicoli {

    // ATTRIBUTI
    private String targa;
    private int immatricolazione;

    // COSTRUTTORE

    public Veicoli(String targa, int immatricolazione) {
        this.targa = targa;
        this.immatricolazione = immatricolazione;
    }

    public Veicoli() {
    }

    // GETTER AND SETTER

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getImmatricolazione() {
        return immatricolazione;
    }

    public void setImmatricolazione(int immatricolazione) {
        this.immatricolazione = immatricolazione;
    }

    // MODULI

    public abstract String visualizzaInformazioni();


}



