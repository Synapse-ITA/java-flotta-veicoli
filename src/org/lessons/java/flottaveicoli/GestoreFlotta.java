package org.lessons.java.flottaveicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

    // ATTRIBUTI

    private List<Veicoli> listaVeicoli;

    // COSTRUTTORE

    public GestoreFlotta(List<Veicoli>listaVeicoli) {
        this.listaVeicoli = new ArrayList<>();
    }

    // GETTER AND SETTER

    public List<Veicoli> getListaVeicoli() {
        return listaVeicoli;
    }

    public void setListaVeicoli(List<Veicoli> listaVeicoli) {
        this.listaVeicoli = listaVeicoli;
    }


    // MODULI

    public void visualizzaInformazioniAutomobili() {
        System.out.println("Informazioni Automobili:");
        for (Veicoli veicolo : listaVeicoli) {
            if (veicolo instanceof Automobili) {
                System.out.println((veicolo).visualizzaInformazioni());
            }
        }
    }

    public void visualizzaInformazioniMotociclette() {
        System.out.println("Informazioni Motociclette:");
        for (Veicoli veicolo : listaVeicoli) {
            if (veicolo instanceof Motociclette) {
                System.out.println((veicolo).visualizzaInformazioni());
            }
        }
    }

    public void visualizzaInformazioniFlotta() {
        System.out.println("Informazioni Flotta:");
        for (Veicoli veicolo : listaVeicoli) {
            System.out.println(veicolo.visualizzaInformazioni());
        }
    }

    // metodo per aggiungere veicolo alla lista
    public void aggiungiNuovoVeicolo(Veicoli veicolo) {
        listaVeicoli.add(veicolo);
    }

    // metodo per rimuovere veicolo dalla lista

    public void rimuoviVeicolo(Veicoli veicolo) {
        listaVeicoli.remove(veicolo);
    }
    public int contaVeicoliPerTipo(Class<? extends Veicoli> tipoVeicolo) {
        int count = 0;
        for (Veicoli veicolo : listaVeicoli) {
            if (tipoVeicolo.isInstance(veicolo)) {
                count++;
            }
        }
        return count;
    }
    public Veicoli trovaVeicoloPerTarga(String numeroTarga) {
        for (Veicoli veicolo : listaVeicoli) {
            if (veicolo.getTarga().equals(numeroTarga)) {
                return veicolo;
            }
        }
        return null;
    }
}



