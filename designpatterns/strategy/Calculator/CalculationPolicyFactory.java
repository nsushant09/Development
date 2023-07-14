package designpatterns.strategy.Calculator;

public class CalculationPolicyFactory {
    static CalculationPolicy getInstance(String calculationType) {
        return switch (calculationType) {
            case "ADDITION" -> new AdditionPolicy();
            case "SUBTRACTION" -> new SubtractionPolicy();
            case "MULTIPLICATION" -> new MultiplicationPolicy();
            default -> new DivisionPolicy();

        };
    }
}
