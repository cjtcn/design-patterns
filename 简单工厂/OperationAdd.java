package com.cjt.patterns.简单工厂;

/**
 * @program: 大话设计模式
 * @description Test
 * @author: CJT
 * @create: 2021-06-23 00:23
 **/
public class OperationAdd extends Operation {


    @Override
    public double getResult() {
        double result;
        result = getNumberA() + getNumberB();
        return result;
    }
}
