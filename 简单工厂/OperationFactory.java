package com.cjt.patterns.简单工厂;

import java.util.Scanner;

/**
 * @program: 大话设计模式
 * @description
 * @author: CJT
 * @create: 2021-06-22 23:40
 **/
// 运算工厂类 通过工厂类来决定实例化哪个运算对象
public class OperationFactory {
    public static Operation createOperate(String Operation) {
        Operation ope = null;
        switch (Operation){
            case "+":
                ope = new OperationAdd();
                break;
            case "-":
                ope = new OperationSub();
                break;
        }
        return ope;
    }

}
