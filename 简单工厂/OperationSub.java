package com.cjt.patterns.简单工厂;

/**
 * @program: 大话设计模式
 * @description Test
 * @author: CJT
 * @create: 2021-06-23 00:30
 **/
// 运算子类（加减乘除） 继承了运算类 由工厂进行创建
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result;
        result = getNumberA() - getNumberB();
        return result;
    }
}
