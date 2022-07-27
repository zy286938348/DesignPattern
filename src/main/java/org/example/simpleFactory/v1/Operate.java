package org.example.simpleFactory.v1;

public class Operate {
    /**
     * 1. 可拓展性不高
     * @param numA
     * @param numB
     * @param op
     * @return
     */
    public double operate(double numA, double numB, String op) {
        double res = 0;
        if (op.equals("+")) {
            res = numA + numB;
        } else if (op.equals("-")) {
            res = numA - numB;
        } else if (op.equals("*")) {
            res = numA * numB;
        }
        return res;
    }
}
