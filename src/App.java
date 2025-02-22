import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean weiterspielen = true;

        System.out.println("Willkommen zu Schere, Stein, Papier!");

        while (weiterspielen) {
            // Spieler-Eingabe
            Choice spielerWahl = null;
            while (spielerWahl == null) {
                System.out.print("Bitte gib Schere, Stein oder Papier ein: ");
                String input = scanner.nextLine();
                spielerWahl = Choice.fromString(input);
                if (spielerWahl == null) {
                    System.out.println("Ungültige Eingabe. Versuch es nochmal.");
                }
            }

            // Computer-Wahl
            Choice[] choices = Choice.values();
            Choice computerWahl = choices[random.nextInt(choices.length)];

            System.out.println("Deine Wahl: " + spielerWahl);
            System.out.println("Computer wählt: " + computerWahl);

            // Auswertung der Runde
            if (spielerWahl == computerWahl) {
                System.out.println("Unentschieden!");
            } else if ((spielerWahl == Choice.SCHERE && computerWahl == Choice.PAPIER)
                    || (spielerWahl == Choice.STEIN && computerWahl == Choice.SCHERE)
                    || (spielerWahl == Choice.PAPIER && computerWahl == Choice.STEIN)) {
                System.out.println("Du gewinnst!");
            } else {
                System.out.println("Computer gewinnt!");
            }

            // Frage, ob weitergespielt werden soll
            System.out.print("Möchtest du noch eine Runde spielen? (ja/nein): ");
            String erneut = scanner.nextLine().trim().toLowerCase();
            if (!erneut.equals("ja")) {
                weiterspielen = false;
                System.out.println("Danke fürs Spielen! Auf Wiedersehen.");
            }
            System.out.println();
        }
        scanner.close();
    }

}