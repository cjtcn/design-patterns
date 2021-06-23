package com.cjt.patterns.简单工厂;

/**
 * @program: 大话设计模式
 * @description Test
 * @author: CJT
 * @create: 2021-06-22 23:43
 **/
public class Operation {
    private double numberA = 0;
    private double numberB = 0;
    // 有参构造
    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }
    // 无参构造
    public Operation() {
    }

    // get and set
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    //  计算方法 子类继承重写
    public double getResult(){
        double result = 0;
        return result;
    }
}
