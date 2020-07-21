package ooP.ersteSchritte.VierGewinnt;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 17.07.2020
 * Time: 15:58
 */
public class VierGewinnt {
    public static Scanner eingabe = new Scanner(System.in);

    public static void main(String[] args) {

        Spielfeld vierGewinntSpielfeld = new Spielfeld();
        Spieler.spielerHinzufuegen();

        // TODO TestArray, zum schnellen testen der möglichen Einträge

        //vierGewinntSpielfeld.feldInhalte[0] = new int[]{1, 2, 0, 2, 0, 0, 0};
        //vierGewinntSpielfeld.feldInhalte[1] = new int[]{1, 1, 2, 0, 0, 0, 0};
        //vierGewinntSpielfeld.feldInhalte[2] = new int[]{1, 2, 0, 0, 0, 0, 1};
        //vierGewinntSpielfeld.feldInhalte[3] = new int[]{2, 2, 1, 1, 0, 1, 2};
        //vierGewinntSpielfeld.feldInhalte[4] = new int[]{1, 2, 0, 2, 1, 2, 2};
        //vierGewinntSpielfeld.feldInhalte[5] = new int[]{1, 2, 1, 1, 1, 1, 2};


        do{
            //Spieler.steinLegen(Spieler.spielerliste, vierGewinntSpielfeld.feldInhalte, vierGewinntSpielfeld);
            vierGewinntSpielfeld.zeichneSpielfeld();
            Gewinnabfragen.gewinnAbfrage(vierGewinntSpielfeld.feldInhalte);
        }while(!Spieler.getGewonnen());




    }


}
