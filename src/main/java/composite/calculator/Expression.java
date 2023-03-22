package composite.calculator;

public class Expression implements ArithematicExpression{
    ArithematicExpression leftExpression;
    ArithematicExpression rightExpression;
    Operation operation;

    public Expression(ArithematicExpression leftExpression, ArithematicExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public double evaluate() {
        double value = 0.0;
        switch (operation) {
            case ADD :
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }
        return value;
    }
}
