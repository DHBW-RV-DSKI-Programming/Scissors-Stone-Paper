enum Choice {

    STEIN,
    PAPIER,
    SCHERE;

    public static Choice fromString(String input) {
        if (input == null) {
            return null;
        }
        input = input.trim().toLowerCase();
        return switch (input) {
            case "schere" -> SCHERE;
            case "stein" -> STEIN;
            case "papier" -> PAPIER;
            default -> null;
        };
    }

}
