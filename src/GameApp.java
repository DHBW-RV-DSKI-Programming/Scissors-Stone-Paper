import java.util.Random;
import java.util.Scanner;

class GameApp {

    void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean weiterspielen = true;

        while (weiterspielen) {
            Choice spielerWahl = getChoice(scanner);

            Choice computerWahl = getComputerChoice(random);

            System.out.println("Spieler: " + spielerWahl);
            System.out.println("Computer: " + computerWahl);

            GameResult gameResult = evaluateRound(spielerWahl, computerWahl);
            printResult(gameResult);

            weiterspielen = isGameContinued(scanner);
            System.out.println();
        }
        scanner.close();
    }

    private Choice getChoice(Scanner scanner) {
        Choice spielerWahl = null;
        while (spielerWahl == null) {
            System.out.println("Schere, Stein oder Papier?");
            String input = scanner.nextLine();
            spielerWahl = Choice.fromString(input);
            if (spielerWahl == null) {
                System.out.println("Ungültige Eingabe. Versuch es nochmal.");
            }
        }
        return spielerWahl;
    }

    private Choice getComputerChoice(Random random) {
        Choice[] choices = Choice.values();
        Choice computerWahl = choices[random.nextInt(choices.length)];
        return computerWahl;
    }

    private GameResult evaluateRound(Choice spielerWahl, Choice computerWahl) {
        if (spielerWahl == computerWahl) {
            return GameResult.TIE;
        } else if ((spielerWahl == Choice.SCHERE && computerWahl == Choice.PAPIER)
                || (spielerWahl == Choice.STEIN && computerWahl == Choice.SCHERE)
                || (spielerWahl == Choice.PAPIER && computerWahl == Choice.STEIN)) {
            return GameResult.HUMAN_WON;
        } else {
            return GameResult.COMPUTER_WON;
        }
    }

    private void printResult(GameResult gameResult) {
        switch (gameResult) {
            case COMPUTER_WON:
                System.out.println("Computer gewinnt! 🤖");
                break;
            case HUMAN_WON:
                System.out.println("Du gewinnst! 🎉");
                break;
            case TIE:
                System.out.println("Unentschieden! 🤝");
                break;
            case null, default:
                System.out.println("Ungültiges Ergebnis.");
        }
    }

    private boolean isGameContinued(Scanner scanner) {
        System.out.print("Möchtest du noch eine Runde spielen? (ja/nein): ");
        Boolean isContinued = null;

        do {
            String playerResponse = scanner.nextLine().trim().toLowerCase();
            isContinued = isReactionValidToContinue(playerResponse);
        } while (isContinued == null);

        return isContinued;
    }

    private Boolean isReactionValidToContinue(String erneut) {
        if (erneut.equals("nein")) {
            System.out.println("Danke fürs Spielen! Auf Wiedersehen.");
            return false;
        } else if (erneut.equals("ja")) {
            System.out.println("Neue Runde beginnt!");
            System.out.println("------------------------------");
            System.out.println();
            return true;
        } else {
            return null;
        }
    }

}
