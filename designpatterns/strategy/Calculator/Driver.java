package designpatterns.strategy.Calculator;

public class Driver {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String operation = "DIVISION";

        Calculator calculator = new Calculator();
        calculator.setCalculationPolicy(CalculationPolicyFactory.getInstance(operation));
        int output = calculator.calculate(a, b);
        System.out.println(output);

    }
}
