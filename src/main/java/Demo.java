public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // пример использования
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));

        System.out.println(intsCalc.mult(5, 5));
        System.out.println(intsCalc.sub(12, 9));
        System.out.println(intsCalc.div(100, 5));
    }
}
