package org.example.simpleFactory.v2.impl;

import org.example.simpleFactory.v2.Operate;

public class OperateSub extends Operate {
    @Override
    public double getResult() {
        return getNumA() - getNumB();
    }
}
