package learn.java.structural.composite.calculator;

public class Number implements ArithmeticExpression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return number;
    }
}
