package org.lessons.java.flottaveicoli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String targaAuto = "FB345CD";
        int annoAuto = 2021;
        int numPorteAuto = 3;
        Automobili fiatPunto = new Automobili(targaAuto, annoAuto, numPorteAuto);
        Automobili opelAgila = new Automobili("DY150KV", 2009, 3);

        String targaMoto = "BD678GD";
        int annoMoto = 2017;
        boolean cavallettoMoto = true;
        Motociclette bn302 = new Motociclette(targaMoto, annoMoto, cavallettoMoto);

        List<Veicoli> listaVeicoli = new ArrayList<>();

        GestoreFlotta gestoreFlotta = new GestoreFlotta(listaVeicoli);

        gestoreFlotta.aggiungiNuovoVeicolo(fiatPunto);
        gestoreFlotta.aggiungiNuovoVeicolo(opelAgila);
        gestoreFlotta.aggiungiNuovoVeicolo(bn302);


        // STAMPO IN CONSOLE LE PROVE
        gestoreFlotta.visualizzaInformazioniAutomobili();
        gestoreFlotta.visualizzaInformazioniMotociclette();
        gestoreFlotta.visualizzaInformazioniFlotta();


        int numeroAutomobili = gestoreFlotta.contaVeicoliPerTipo(Automobili.class);
        System.out.println("Numero di automobili: " + numeroAutomobili);

        int numeroMotociclette = gestoreFlotta.contaVeicoliPerTipo(Motociclette.class);
        System.out.println("Numero di motociclette: " + numeroMotociclette);

        System.out.print("Inserisci il numero di targa da cercare: ");
        String numeroTargaDaCercare = scanner.nextLine();
        scanner.close();
        Veicoli veicoloTrovato = gestoreFlotta.trovaVeicoloPerTarga(numeroTargaDaCercare);
        if (veicoloTrovato != null) {
            System.out.println("Veicolo trovato: " + veicoloTrovato.visualizzaInformazioni());
        } else {
            System.out.println("Veicolo non trovato.");
        }
    }
}
