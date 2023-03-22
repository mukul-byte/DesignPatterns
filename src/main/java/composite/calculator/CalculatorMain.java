package composite.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        /*
                      +
                  *      -
                /   2   3   1
              4   2

         */

//        ((4/2)*2)+(3-1) = 6

        Expression fourDivideTwo = new Expression(new Number(4),
                                                    new Number(2), Operation.DIVIDE);
        Expression threeMinusOne = new Expression(new Number(3),
                                                    new Number(1), Operation.SUBTRACT);
        Expression aMultiplyB = new Expression(fourDivideTwo, threeMinusOne, Operation.MULTIPLY);
        Expression aAddB = new Expression(aMultiplyB, threeMinusOne, Operation.ADD);

        System.out.println(aAddB.evaluate());

    }
}
