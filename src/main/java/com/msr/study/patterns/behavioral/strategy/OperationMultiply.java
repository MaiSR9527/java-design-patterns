package com.msr.study.patterns.behavioral.strategy;

/**
 * 乘法操作
 *
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class OperationMultiply implements IStrategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
