package learn.java.structural.composite.calculator;

public class Expression implements ArithmeticExpression {
    ArithmeticExpression left;
    ArithmeticExpression right;
    Operation operation;

    public Expression(ArithmeticExpression left, ArithmeticExpression right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int ans = 0;

        switch (operation) {
            case ADD: ans = left.evaluate() + right.evaluate();
                      break;
            case SUBTRACT: ans = left.evaluate() - right.evaluate();
                           break;
            case MULTIPLY: ans = left.evaluate() * right.evaluate();
                           break;
            case DIVIDE: ans = left.evaluate() / right.evaluate();
                         break;
        }

        return ans;
    }
}
