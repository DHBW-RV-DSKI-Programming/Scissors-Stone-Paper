enum Choice {

    STEIN,
    PAPIER,
    SCHERE;

    public static Choice fromString(String input) {
        if (input == null) {
            return null;
        }
        input = input.trim().toLowerCase();
        switch (input) {
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
