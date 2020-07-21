package ooP.ersteSchritte.VierGewinnt;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 21.07.2020
 * Time: 09:00
 */
public class Gewinnabfragen {

    public static boolean gewinnAbfrage(int[][] feldInhalte) {
        //horizontalAbfrage(feldInhalte);
        //vertikaleAbfrage(feldInhalte);
        diagonalAbwaerts(feldInhalte);
        diagnalAb(feldInhalte);

        return Spieler.getGewonnen();
    }

    public static void diagonalAbwaerts(int[] @NotNull [] feldInhalte) {
        for (int zeilen = 0; zeilen < feldInhalte.length-3; zeilen++) {
            for (int spalten = 0; spalten < feldInhalte[1].length - 3; spalten++) {
                if (!(Spieler.getGewonnen()) && feldInhalte[zeilen + 1][spalten + 1] != 0 && feldInhalte[zeilen][spalten] == feldInhalte[zeilen + 2][spalten + 2] &&
                        (feldInhalte[zeilen][spalten] == feldInhalte[zeilen + 3][spalten + 3])) {
                    System.out.println("  Prüfe d an " + feldInhalte[zeilen][spalten] + " mit " + feldInhalte[zeilen + 3][spalten + 3] % 2);
                    //System.out.println("  Prüfe d an " + feldInhalte[zeilen][spalten] + " mit " + feldInhalte[zeilen + 4][spalten + 4] % 2);
                    System.out.println("egal ");
                    Spieler.setGewonnen(true);
                    System.out.println("WIN");
                    break;
                }
            }
        }
    }

    public static void diagnalAb ( int[][] feldInhalte){
        for (int zeilen = 3; zeilen < feldInhalte.length-1; zeilen++) {
            for (int spalten = 0; spalten < feldInhalte[1].length - 1; spalten++) {

                if (!(Spieler.getGewonnen()) && feldInhalte[zeilen - 1][spalten + 1] != 0 && feldInhalte[zeilen][spalten] == feldInhalte[zeilen - 2][spalten + 2]
                        && (feldInhalte[zeilen][spalten] == feldInhalte[zeilen - 3][spalten + 3])) {
                    System.out.println("  Prüfe d an " + feldInhalte[zeilen][spalten] + " mit " + feldInhalte[zeilen - 3][spalten + 3]);
                    //System.out.println("  Prüfe d an " + feldInhalte[zeilen][spalten] + " mit " + feldInhalte[zeilen + 4][spalten + 4] % 2);
                    System.out.println("egal ");
                    Spieler.setGewonnen(true);
                    System.out.println("WIN");
                    break;
                }
            }
        }
    }

    public static void vertikaleAbfrage(int[] @NotNull [] feldInhalte) {
        int zaehler = 0;

        for (int j = 0; j < feldInhalte[1].length; j++) {

            if (!(Spieler.getGewonnen())) {
                for (int i = 0; i < feldInhalte.length; i++) {
                    if (i < feldInhalte.length - 1) {
                        if (feldInhalte[i][j] == feldInhalte[i + 1][j] && feldInhalte[i + 1][j] != 0) {
                            zaehler++;
                            if (zaehler == 3) {
                                System.out.println("GEWONNEN - vertical, Spalte " + (j + 1));
                                Spieler.setGewonnen(true);
                                break;
                            }
                        } else {
                            zaehler = 0;
                        }
                    }

                }
            } else break;
        }
    }

    public static void horizontalAbfrage(int[] @NotNull [] feldInhalte) {
        int zaehler = 0;

        for (int i = 0; i < feldInhalte.length; i++) {

            if (!(Spieler.getGewonnen())) {
                for (int j = 0; j < feldInhalte[1].length; j++) {
                    if (j < feldInhalte[i].length - 1) {
                        if (feldInhalte[i][j] == feldInhalte[i][j + 1] && feldInhalte[i][j + 1] != 0) {
                            zaehler++;
                            if (zaehler == 3) {
                                System.out.println("GEWONNEN - horizontal, Zeile " + (i + 1));
                                Spieler.setGewonnen(true);
                                break;
                            }
                        } else {
                            zaehler = 0;
                        }
                    }
                }
            } else break;
        }
    }



}
