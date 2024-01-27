package learn.java.structural.composite.calculator;

public class CalculatorDriver {
    public static void main(String[] args) {
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression five = new Number(5);

        ArithmeticExpression add2And5 = new Expression(two, five, Operation.ADD);
        System.out.println("2 + 5 = " + add2And5.evaluate());


        ArithmeticExpression multiply2And5 = new Expression(two, five, Operation.MULTIPLY);
        System.out.println("2 * 5 = " + multiply2And5.evaluate());
    }
}
