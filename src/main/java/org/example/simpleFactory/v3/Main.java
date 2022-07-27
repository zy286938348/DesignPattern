package org.example.simpleFactory.v3;

import org.example.simpleFactory.v3.factory.OperateFactory;

public class Main {
    public static void main(String[] args) {
        /**
         * 使用简单工厂模式
         * 1、如需添加新的计算功能，只需要继承Operate，然后在Factory类中添加新的case分支
         */
        Operate operate = OperateFactory.createOperate("+");
        operate.setNumA(1);
        operate.setNumB(2);
        System.out.println(operate.getResult());
    }
}
