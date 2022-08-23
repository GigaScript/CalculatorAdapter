package com.company;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    private int getCalculationResult(int arg0, int arg1, Calculator.Operation operation) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(operation)
                .result();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return getCalculationResult(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return getCalculationResult(arg0, arg1, Calculator.Operation.MULT);

    }

    @Override
    public int pow(int arg0, int arg1) {
        return getCalculationResult(arg0, arg1, Calculator.Operation.POW);
    }
}
