public class IntsCalculator implements Ints {
    private double resultDouble;
    Calculator calculator = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {
        resultDouble = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) resultDouble;
    }

    @Override
    public int mult(int arg0, int arg1) {
        resultDouble = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        return (int) resultDouble;
    }

    @Override
    public int pow(int a, int b) {
        resultDouble = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
        return (int) resultDouble;
    }

    @Override
    public int div(int a, int b) {
        resultDouble = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result;
        return (int) resultDouble;
    }

    @Override
    public int sub(int a, int b) {
        resultDouble = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result;
        return (int) resultDouble;
    }
}
