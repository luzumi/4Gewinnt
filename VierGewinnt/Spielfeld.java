package ooP.ersteSchritte.VierGewinnt;

import java.util.Random;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 17.07.2020
 * Time: 17:55
 */
public class Spielfeld {
    private static int spalten = 7;
    private static int zeilen = 6;
    int zahl = 0;
    public int[][] feldInhalte = new int[zeilen][spalten];

    public void erstelleSpielfeld() {
        for (int zeile = 0; zeile < zeilen; zeile++) {


            System.out.println();
            for (int spalte = 0; spalte < spalten; spalte++) {
                zahl++;
                feldInhalte[zeile][spalte] = zahl;

                System.out.print(" \t" + feldInhalte[zeile][spalte]);

            }
        }
    }

    public void zeichneSpielfeld() {
        System.out.println();
        System.out.println("4 Gewinnt____________________");
        for (int zeile = 0; zeile < zeilen; zeile++) {
            System.out.println();
            for (int spalte = 0; spalte < spalten; spalte++) {
                System.out.print(" \t" + feldInhalte[zeile][spalte]);
            }
        }
        System.out.println("\n___________________gezeichnet");
    }

    //Testfüllung des Spielfelds
    public void randomFill() {
        for (int zeile = 0; zeile < zeilen; zeile++) {

            System.out.println();
            for (int spalte = 0; spalte < spalten; spalte++) {
                feldInhalte[zeile][spalte] = new Random().nextInt(43);

                System.out.print(" \t" + feldInhalte[zeile][spalte]);

            }
        }
    }

}
