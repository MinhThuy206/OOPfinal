package com.expression;

public class DivisionOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        if(rightOperand.evaluate() == 0){
            System.out.println("Mẫu là 0. Phép tính sai");
            return 0;
        }
        else{
            return leftOperand.evaluate()/rightOperand.evaluate();
        }
    }
}
