package com.cjt.patterns.简单工厂;

import java.util.Scanner;

/**
 * @program: 大话设计模式
 * @description Test
 * @author: CJT
 * @create: 2021-06-22 23:43
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("请输入数字A： ");
        Scanner sc1 = new Scanner(System.in);
        String strA = sc1.nextLine();
        double A = Double.parseDouble(strA);
        System.out.println("请输入数字B： ");
        Scanner sc2 = new Scanner(System.in);
        String strB = sc2.nextLine();
        double B = Double.parseDouble(strB);
        System.out.println("请输入运算符号： ");
        Scanner sc3 = new Scanner(System.in);
        String strOperation = sc3.nextLine();

        Operation ope;
        // 操作工厂类根据输入的具体操作来实例化一个操作类对象（子类）
        ope = OperationFactory.createOperate(strOperation);
        // 对操作类中的A B 赋值
        ope.setNumberA(A);
        ope.setNumberB(B);
        // 多态 使用继承操作类的子类来进行相应的运算
        double result = ope.getResult();
        System.out.println(A + " " + strOperation + " " + B + " = " + result);
    }
}
