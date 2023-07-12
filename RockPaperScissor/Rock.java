package RockPaperScissor;

public class Rock implements Element {
    private static Element instance = null;

    private Rock(){}
    public static Element getInstance() {
        if (instance == null) {
            instance = new Rock();
        }
        return instance;
    }

    @Override
    public Result getResult(Element comparingElement) {
        return switch (comparingElement.getName()) {
            case "SCISSOR" -> Result.WON;
            case "PAPER" -> Result.LOST;
            default -> Result.DRAW;
        };
    }

    @Override
    public String getName() {
        return "ROCK";
    }
}
