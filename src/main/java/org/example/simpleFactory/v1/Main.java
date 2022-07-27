package org.example.simpleFactory.v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numA = scan.nextDouble();
        double numB = scan.nextDouble();
        String op = scan.next();
        scan.close();
        Operate operate = new Operate();
        double res = operate.operate(numA, numB, op);
        System.out.print(res);
    }
}
