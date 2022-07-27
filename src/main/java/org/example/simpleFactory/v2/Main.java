package org.example.simpleFactory.v2;

import org.example.simpleFactory.v2.impl.OperateAdd;

public class Main {
    /**
     * 需要指定调用哪个运算函数，故引入简单工厂模式v3
     */
    public static void main(String[] args) {
        Operate operate = new OperateAdd();
        operate.setNumA(1.2);
        operate.setNumB(1.8);
        System.out.println(operate.getResult());
    }
}
