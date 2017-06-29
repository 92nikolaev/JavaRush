package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String trace = stackTraceElements[2].getMethodName();
        System.out.println(trace);
        return trace;
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String trace = stackTraceElements[2].getMethodName();
        System.out.println(trace);
        return trace;
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String trace = stackTraceElements[2].getMethodName();
        System.out.println(trace);
        return trace;
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String trace = stackTraceElements[2].getMethodName();
        System.out.println(trace);
        return trace;
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String trace = stackTraceElements[2].getMethodName();
        System.out.println(trace);
        return trace;
    }
}
