package com.company;

public class Car {
    String name = "AUDI";
    static int num = 7777;
    Car() {
        num++;
        System.out.println(name+" "+num);
    }
}
