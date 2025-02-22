enum Choice {

    STEIN,
    PAPIER,
    SCHERE;

    // Gibt den Choice-Wert basierend auf einer Eingabe zurück, falls gültig
    public static Choice fromString(String input) {
        if (input == null) {
            return null;
        }
        switch (input.trim().toLowerCase()) {
            case "schere":
                return SCHERE;
            case "stein":
                return STEIN;
            case "papier":
                return PAPIER;
            default:
                return null;
        }
    }

}
