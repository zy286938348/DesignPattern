package org.example.simpleFactory.v3.impl;

import org.example.simpleFactory.v3.Operate;

public class OperateMul extends Operate {
    @Override
    public double getResult() {
        return getNumA() * getNumB();
    }
}
