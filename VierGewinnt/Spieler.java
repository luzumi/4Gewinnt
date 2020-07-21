package ooP.ersteSchritte.VierGewinnt;


import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 17.07.2020
 * Time: 17:47
 */
public class Spieler {
    private final String name;
    public static Spieler[] spielerliste;
    public static int auswahl = 0;
    private static boolean gewonnen = false;


    public Spieler(String name) {
        this.name = name;
    }

    public static Spieler[] getSpielerliste() {
        return spielerliste;
    }
    public static void setSpielerliste(Spieler[] spielerliste) {
        Spieler.spielerliste = spielerliste;
    }
    public static boolean getGewonnen() {
        return gewonnen;
    }
    public static void setGewonnen(boolean gewonnen) {
        Spieler.gewonnen = gewonnen;
    }

    //Spieleranzahl und Eintrag in Spielerliste
    public static void spielerHinzufuegen() {
        System.out.println("Wieviele Spieler möchten teilnehmen?");
        int anzahl = VierGewinnt.eingabe.nextInt();
        spielerliste = new Spieler[anzahl];
        for (int anzahlSpieler = 0; anzahlSpieler < anzahl; anzahlSpieler++) {
            System.out.println(anzahlSpieler + 1 + ". Spielername: ");
            spielerliste[anzahlSpieler] = new Spieler(VierGewinnt.eingabe.next());
        }
    }
    public static void listeAnzeigen(Spieler @NotNull [] spielerliste) {
        for (int i = 0; i < spielerliste.length; i++) {
            if (spielerliste[i] != null) {
                System.out.println(spielerliste[i].name);
            }
        }
    }

    //Methode für main-Spielablauf
    public static void steinLegen(Spieler @NotNull [] spielerliste, int[][] feldInhalte, Spielfeld vierGewinntSpielfeld) {
        int spielernummer = 0;

        for (Spieler spieler : spielerliste) {
            System.out.println(spieler.name + " in welche Spalte soll Ihr Stein? ");
            auswahl = VierGewinnt.eingabe.nextInt();

            spielernummer++;
            for (int i = feldInhalte.length; i > 0; i--) {
                if (feldInhalte[i - 1][auswahl - 1] == 0) {
                    feldInhalte[i - 1][auswahl - 1] = spielernummer;

                    break;
                }
            }

            vierGewinntSpielfeld.zeichneSpielfeld();
            //gewinnAbfrage(feldInhalte);
        }
    }
}
