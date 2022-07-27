package org.example.simpleFactory.v3.factory;

import org.example.simpleFactory.v3.Operate;
import org.example.simpleFactory.v3.impl.OperateAdd;
import org.example.simpleFactory.v3.impl.OperateMul;
import org.example.simpleFactory.v3.impl.OperateSub;

public class OperateFactory {
    public static Operate createOperate(String op){
        Operate operate = null;
        switch (op){
            case "*":
                operate = new OperateMul();
                break;
            case "-":
                operate = new OperateSub();
                break;
            case "+":
                operate = new OperateAdd();
                break;
        }
        return operate;
    }
}
