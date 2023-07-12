package RockPaperScissor;

public class Paper implements Element {
    private static Element instance = null;

    public static Element getInstance() {
        if (instance == null) {
            instance = new Paper();
        }
        return instance;
    }

    @Override
    public Result getResult(Element comparingElement) {
        return switch (comparingElement.getName()) {
            case "ROCK" -> Result.WON;
            case "SCISSOR" -> Result.LOST;
            default -> Result.DRAW;
        };
    }

    @Override
    public String getName() {
        return "PAPER";
    }
}