package RockPaperScissor;

public interface Element {
    Result getResult(Element comparingElement);
    String getName();
}

enum Result {
    WON,
    LOST,
    DRAW
}
