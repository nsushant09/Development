package RockPaperScissor;

public class ElementFactory {
    static Element getElement(String name) {
        return switch (name) {
            case "ROCK" -> Rock.getInstance();
            case "PAPER" -> Paper.getInstance();
            default -> Scissor.getInstance();
        };
    }
}
