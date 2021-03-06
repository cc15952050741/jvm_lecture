package com.ssy.jvm.classloader;

class Parent3{
    static int a = 3;
    static {
        System.out.println("Parent3 static block");
    }

    static void doSomething() {
        System.out.println("do sth.");
    }
}

class Child3 extends Parent3 {
    static {
        System.out.println("Child3 static block");
    }
}

public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(Child3.a);
        System.out.println("--------");
        Child3.doSomething();
    }
}
