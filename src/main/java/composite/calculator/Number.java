package composite.calculator;

public class Number implements ArithematicExpression{
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
