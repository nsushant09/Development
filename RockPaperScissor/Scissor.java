package RockPaperScissor;

public class Scissor implements Element {
    private static Element instance = null;

    private Scissor(){}
    public static Element getInstance() {
        if (instance == null) {
            instance = new Scissor();
        }
        return instance;
    }

    @Override
    public Result getResult(Element comparingElement) {
        return switch (comparingElement.getName()) {
            case "PAPER" -> Result.WON;
            case "ROCK" -> Result.LOST;
            default -> Result.DRAW;
        };
    }

    @Override
    public String getName() {
        return "SCISSOR";
    }
}