package com.expression;

public class TestExpressions {
    public static void main(String[] args) {
        /* TODO */
        /* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */
        Expression a = new Expression(
                new Expression(
                        new Expression(
                                new Operand(1),
                                new Operand(2),
                                new AdditionOperator()
                        ), new Operand(3),
                        new MultiplicationOperator()
                ), new Operand(4), new SubtractionOperator());
        System.out.println(a.evaluate());

    }
}
